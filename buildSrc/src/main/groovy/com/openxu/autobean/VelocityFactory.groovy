package com.openxu.autobean

import org.apache.velocity.Template
import org.apache.velocity.VelocityContext
import org.apache.velocity.app.Velocity
import org.apache.velocity.runtime.RuntimeConstants
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader

import java.text.SimpleDateFormat

/**
 * Author: openXu 
 * Time: 2020/5/15 15:46
 * class: VelocityUtil
 * Description: 
 */
class VelocityFactory {

    static{
        //配置velocity的资源加载路径
        Properties velocityPros = new Properties()
        velocityPros.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath")
        velocityPros.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName())
        velocityPros.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8")
        velocityPros.setProperty(Velocity.INPUT_ENCODING, "UTF-8")
        velocityPros.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8")
        Velocity.init(velocityPros)
    }

    /**
     * 根据模板生成JavaBean文件内容
     * @param packageName 包名
     * @param tableName mysql表名
     * @param columnList 表字段集合
     * @return
     */
    static String getVmContent(String packageName, String className, List<Column> columnList){
        //绑定velocity数据
        VelocityContext context = new VelocityContext()
        context.put("packageName", packageName)    //实体类分包 com.openxu.bean
        context.put("time", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()))   //实体类生成时间2020/3/30 14:31
        context.put("className", className)
        context.put("columns", columnList)
        //根据模板生成java文件内容
        Template template = Velocity.getTemplate("bean.vm")
        StringWriter writer = new StringWriter()
        template.merge(context, writer)
        writer.flush()
        writer.close()
        return writer.toString()
    }
}
