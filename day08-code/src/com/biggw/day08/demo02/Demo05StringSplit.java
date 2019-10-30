package com.biggw.day08.demo02;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 21:29
 */

/*
 * 字符串的分割方法
 *
 * public String[] split(String regex); 按照参数的规则（正则表达式）,将字符串切割并返回
 *
 * 如果要按照.进行切割,那么需要regex = "\\."
 * */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "abc,def,ghi";
        String[] strings = str1.split(",");
        for (String string : strings) {
            System.out.println("string = " + string);
        }

        String str2 = "123.456.789";
        String[] strings1 = str2.split("\\.");
        for (String s : strings1) {
            System.out.println("s = " + s);
        }
    }
}
