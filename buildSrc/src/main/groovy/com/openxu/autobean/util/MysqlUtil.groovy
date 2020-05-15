package com.openxu.autobean.util

import com.openxu.autobean.BeanDataSource
import groovy.sql.Sql

/**
 * Author: openXu 
 * Time: 2020/5/15 14:10
 * class: MysqlUtil
 * Description: 
 */
class MysqlUtil {
    BeanDataSource dataSource

    MysqlUtil(BeanDataSource dataSource){
        this.dataSource = dataSource
        //可以指定maven仓库
         //@GrabResolver(name = 'aliyun', root = 'http://maven.aliyun.com/nexus/content/groups/public/')
        //加载数据库连接驱动包
//        @Grab('mysql:mysql-connector-java:8.0.20')
//        @Grab('mysql:mysql-connector-java:5.1.25')
//        @GrabConfig(systemClassLoader = true)
//         sql = Sql.newInstance(dataSource.url, dataSource.userName,
//                dataSource.password, "com.mysql.jdbc.Driver")

       /* try {
//            Class.forName(dataSource.getDriver())
            Class.forName("com.mysql.jdbc.Driver")
            System.out.println("驱动："+dataSource.getDriver())
            conn = DriverManager.getConnection(dataSource.getUrl(), dataSource.getUserName(), dataSource.getPassword())
        } catch (Exception e) {
            System.out.println("报错："+e.getMessage())
            e.printStackTrace()
        }*/
    }

    // select TABLE_NAME from information_schema.tables where table_schema='iipplat_exam'
    // select COLUMN_NAME, COLUMN_TYPE, COLUMN_KEY from information_schema.columns where table_schema='iipplat_exam' and table_name='exam_examinetask'

    /**
     * 获取数据库中所有表名称
     * @return
     */
    List<String> getAllTable(){
        List<String> tables = new ArrayList<>()
        String sql_gettables = String.format("select TABLE_NAME from information_schema.tables where table_schema='%s'",dataSource.getDbName())
        //加载数据库连接驱动包
//        @Grab('mysql:mysql-connector-java:8.0.20')
//        @Grab('mysql:mysql-connector-java:5.1.25')
//        @GrabConfig(systemClassLoader = true)
       def sql = Sql.newInstance(dataSource.url, dataSource.userName,
                dataSource.password, "com.mysql.jdbc.Driver")
        sql.eachRow(sql_gettables){ row
            tables.add(row.TABLE_NAME)
        }

        return tables
    }

   /* List<Column> getTableColumns(String tableName){
        String sql_getCloumns = String.format("select COLUMN_NAME, COLUMN_TYPE, COLUMN_KEY from information_schema.columns" +
                " where table_schema='%s' and table_name='%s'",dataSource.getDbName(), tableName)
        List<Column> columnList = new ArrayList<>()
        try {
            Statement statement = conn.createStatement()
            ResultSet resultSet =  statement.executeQuery(sql_getCloumns)
            while(resultSet.next()) {
                columnList.add(new Column(tableName,
                        resultSet.getString("COLUMN_NAME"),
                        resultSet.getString("COLUMN_TYPE"),
                        resultSet.getString("COLUMN_KEY")))
            }
        } catch (SQLException e) {
            e.printStackTrace()
        }
        return columnList
    }
*/

}
