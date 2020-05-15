package com.openxu.autobean


import com.openxu.autobean.util.MysqlHelper
import com.openxu.autobean.util.StringUtil
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Author: openXu 
 * Time: 2020/5/15 11:25
 * class: AutoBeanTask
 * Description: 
 */
class AutoBeanTask extends DefaultTask{

    /**任务执行体 */
    @TaskAction
    def generateBean(){
        String outPath = String.format("%s/src/main/java/%s",project.getProjectDir(), beanDataSource.packageName.replaceAll("\\.", "/"))
        System.out.println("输出路径："+outPath)
        //从mysql中查询表及字段
        MysqlHelper helper = new MysqlHelper(beanDataSource)
        List<String> tableList = helper.getAllTable()
        for(String tableName : tableList){
            //获取表字段集合
            List<Column> columnList = helper.getTableColumns(tableName)
            //根据模板创建java文件
            writeFile(outPath, tableName, columnList)
        }
    }

    /**
     * 根据Mysql表及字段集合，通过Velocity模板自动生成实体类代码，写入对应类文件中
     * @param filePath 实体类存放路径
     * @param tableName 表名
     * @param columnList 字段集合
     */
     void writeFile(String filePath, String tableName, List<Column> columnList) {
         //获取实体类名
        String className = StringUtil.underline2PascalStyle(tableName)
        //获取文件内容
        String classContent = VelocityFactory.getVmContent(beanDataSource.packageName, className, columnList)
        File dir = new File(filePath)
        if (!dir.exists())
            dir.mkdirs()
        File file = new File(dir, className+".java")
        java.io.FileWriter writer = null
        try {
            writer = new java.io.FileWriter(file)
            writer.write(classContent)
        } catch (IOException e) {
            throw new RuntimeException("Error creating file " + className, e)
        } finally {
            if (writer != null) {
                try {
                    writer.close()
                } catch (IOException e) {
                }
            }
        }
    }
}
