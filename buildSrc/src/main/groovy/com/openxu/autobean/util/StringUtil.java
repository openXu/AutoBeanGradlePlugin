package com.openxu.autobean.util;

import org.apache.commons.lang.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: openXu
 * Time: 2020/4/7 15:42
 * class: FileWriter
 * Description:
 */
public class StringUtil {

    /**
     * 字符串分隔符
     */
    public static final String SEPARATOR = String.valueOf((char) 29);

    /**
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty(String str) {
        return StringUtils.isNotEmpty(str);
    }

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        return StringUtils.isEmpty(str);
    }

    /**
     * 将字符串首字母大写
     */
    private static String firstToUpper(String str) {
        if(isNotEmpty(str)){
            if(str.length()>1){
                return Character.toUpperCase(str.charAt(0)) + str.substring(1);
            }else{
                return Character.toUpperCase(str.charAt(0))+"";
            }
        }
        return "";
    }
    /**
     * 将字符串尾字母大写
     */
    private static String lastToUpper(String str) {
        if(isNotEmpty(str)){
            if(str.length()>1){
                return str.substring(0, str.length()-1) + Character.toUpperCase(str.charAt(str.length()-1));
            }else{
                return Character.toUpperCase(str.charAt(0))+"";
            }
        }
        return "";
    }
    /**
     * 将字符串首字母小写
     */
    private static String firstToLower(String str) {
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    /**
     * 首个单词大写的字符串转换为首个单词驼峰
     * @param str
     * @return
     */
    private static String firstWordUpperToCamel(String str){
        /*
         * ID  ->  Id
         * ENUMType   -> EnumType
         */
//        String str = "ID";
    //        String str = "Id";
    //        String str = "ENUMType";
        //判断字符串是否连续大写开头
        Matcher matcher = Pattern.compile("[A-Z]{2,}").matcher(str);   //连续大写字母出现2次及以上
        if(matcher.find()){  //匹配第一次出现
            if(matcher.start() == 0 && matcher.end() > 1){
                //ENUMType     0   5
                System.out.println("匹配开始："+matcher.start()+"    匹配结尾："+ matcher.end() +"    "+str.length()   +"   "+matcher.group());
                StringBuilder builder = new StringBuilder(str);
                //字符串是连续大写开头，需要转换
                if(matcher.end() < str.length()){
                    //多个单词，第一个单词全大写 ENUMType -> EnumType
                    builder.replace(0, matcher.end(), lastToUpper(firstToUpper(matcher.group().toLowerCase())));
                }else{
                    //单个单词大写 ID -> id
                    builder.replace(0, matcher.end() , matcher.group().toLowerCase());
                }
                str = builder.toString();
                System.out.println("转换："+str);
            }
        }
        return str;
    }

    /**
     * 将驼峰风格替换为下划线风格
     */
    private static String camelhumpToUnderline(String str) {
        //将连续大写单词转换为标准驼峰格式 X{n,}	X, at least n times
        Matcher matcher = Pattern.compile("[A-Z]{2,}").matcher(str);   //连续大写字母出现2次及以上
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; matcher.find(); i++) {
            builder.replace(matcher.start() + i, matcher.end() + i, firstToUpper(matcher.group().toLowerCase()));
        }
        //将驼峰转换为下划线格式
        str = builder.toString();
        matcher = Pattern.compile("[A-Z]").matcher(str);
        builder = new StringBuilder(str);
        for (int i = 0; matcher.find(); i++) {
            builder.replace(matcher.start() + i, matcher.end() + i, "_" + matcher.group().toLowerCase());
        }
        if (builder.charAt(0) == '_') {
            builder.deleteCharAt(0);
        }
        return builder.toString();
    }

    /**
     * 将下划线风格替换为驼峰风格
     */
    private static String underlineToCamelhump(String str) {
        if(isNotEmpty(str)){
            Matcher matcher = Pattern.compile("_[a-z]").matcher(str);
            StringBuilder builder = new StringBuilder(str);
            for (int i = 0; matcher.find(); i++) {
                builder.replace(matcher.start() - i, matcher.end() - i, matcher.group().substring(1).toUpperCase());
            }
            if (Character.isUpperCase(builder.charAt(0))) {
                builder.replace(0, 1, String.valueOf(Character.toLowerCase(builder.charAt(0))));
            }
            return builder.toString();
        }
        return "";
    }

    /**
     * 将UserName风格替换为user_name风格
     */
    public static String pascal2UnderlineStyle(String str) {
        return camelhumpToUnderline(firstToLower(firstWordUpperToCamel(str)));
    }

    /**
     * 将user_name风格替换为UserName风格
     */
    public static String underline2PascalStyle(String str) {
        return firstToUpper(underlineToCamelhump(str));
    }


}
