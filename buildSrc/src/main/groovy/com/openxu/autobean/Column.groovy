package com.openxu.autobean
import com.openxu.autobean.util.StringUtil

/**
 * Author: openXu 
 * Time: 2020/5/15 13:47
 * class: Column
 * Description: 
 */
class Column {
    String fieldName  // 实体类属性名
    String fieldType  // 实体类属性类型
    Column(String mysqlColumnName, String columnType) {
        this.fieldName = mysqlColumnName
        this.fieldType = column2FieldType(columnType)
    }
    /**
     * mysql字段 与 实体类bean属性 类型对应关系
     * @param columnType
     * @return
     */
    String column2FieldType(String columnType){
        //字符串类型
        if(columnType.contains("varchar")           //变长字符串 0-65535 bytes
                || columnType.contains("char")      //定长字符串 0-255 bytes
                || columnType.contains("text")      //长文本数据 0-65 535 bytes
                || columnType.contains("longtext")  //极大文本数据  0-4 294 967 295 bytes
                //日期和时间类型
                || columnType.equalsIgnoreCase("date")
                || columnType.equalsIgnoreCase("time")
                || columnType.equalsIgnoreCase("year")
                || columnType.equalsIgnoreCase("datetime")
                || columnType.equalsIgnoreCase("timestamp")){
            return "String"
            //数值类型
        }else if(columnType.contains("bigint")){   //极大整数值 8 bytes
            return "Long"   //64位整数
        }else if(columnType.contains("int")||
                columnType.contains("integer")){
            return "Integer"
        }else if(columnType.contains("float") ||   //单精度 浮点数值4 bytes
                columnType.contains("decimal")){   //小数值
            return "Float"
        }else if(columnType.contains("double")){ //双精度 浮点数值 8 bytes){   //极大整数值 8 bytes
            return "Double"
        }
        return columnType
    }
}
