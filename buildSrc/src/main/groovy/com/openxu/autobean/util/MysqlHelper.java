package com.openxu.autobean.util;

import com.openxu.autobean.BeanDataSource;
import com.openxu.autobean.Column;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: openXu
 * Time: 2020/5/15 14:25
 * class: MysqlHelper
 * Description:
 */
public class MysqlHelper {
    Connection conn;
    BeanDataSource dataSource;

    public MysqlHelper(BeanDataSource dataSource){
        this.dataSource = dataSource;
        try {
            Class.forName(dataSource.getDriver());
            conn = DriverManager.getConnection(dataSource.getUrl(), dataSource.getUserName(), dataSource.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // select TABLE_NAME from information_schema.tables where table_schema='iipplat_exam'
    // select COLUMN_NAME, COLUMN_TYPE, COLUMN_KEY from information_schema.columns where table_schema='iipplat_exam' and table_name='exam_examinetask'

    /**
     * 查询mysql中所有的表
     * @return
     */
    List<String> getAllTable(){
        List<String> tables = new ArrayList<>();
        String sql_gettables = String.format("select TABLE_NAME from information_schema.tables where table_schema='%s'",dataSource.getDbName());
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet =  statement.executeQuery(sql_gettables);
            while(resultSet.next()) {
                tables.add(resultSet.getString("TABLE_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tables;
    }

    /**
     * 查询指定表的字段集合
     * @param tableName
     * @return
     */
    List<Column> getTableColumns(String tableName){
        String sql_getCloumns = String.format("select COLUMN_NAME, COLUMN_TYPE, COLUMN_KEY from information_schema.columns" +
                " where table_schema='%s' and table_name='%s'",dataSource.getDbName(), tableName);
        List<Column> columnList = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet =  statement.executeQuery(sql_getCloumns);
            while(resultSet.next()) {
                columnList.add(new Column(
                        resultSet.getString("COLUMN_NAME"),
                        resultSet.getString("COLUMN_TYPE")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columnList;
    }


}
