package com.openxu.autobean

/**
 * Author: openXu 
 * Time: 2020/5/15 11:08
 * class: DataSource
 * Description: 数据源，Mysql配置
 */
class BeanDataSource {
    //需要配置项
    String driver
    String url
    String userName
    String password
    String packageName   //bean输出目录
    //数据库名称(自动截取)
    String dbName
    BeanDataSource build() {
        dbName = url.substring(url.lastIndexOf("/")+1, url.lastIndexOf("?"))
        System.out.println("---------数据库名称："+dbName+"   bean包名："+packageName)
        return this
    }
}
