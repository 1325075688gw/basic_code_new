package com.biggw.day12.demo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 20:10
 */

/*
 * 字符串和基本数据类型之间相转换
 *
 * 基本类型---->字符串
 * 1.基本数据类型+""    最简单的方法(工作中常用的方法)
 * 2.包装类的静态方法,toString(参数)  返回String对象
 *      public static toString(int i);
 * 3.String类中静态方法,valueOf(int i) 返回String对象
 *      public static valueOf(int i);
 *
 * 字符串---->基本类型
 * 1.使用包装类中的静态方法,parseInt("字符串")
 *      public static parseInt(String s)
 *      Integer i = Integer.parseInt("23")
 *      Double i = Double.parseDouble("23")
 *
 * */
public class Demo08MutualConversion {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        int i = 100;
        String string = 100 + "";
        System.out.println("string = " + string);
        System.out.println("=================");

        String string1 = String.valueOf(i);
        System.out.println("string1 = " + string1);
        System.out.println("=================");

        String string2 = Integer.toString(i);
        System.out.println("string2 = " + string2);
        System.out.println("=================");

        // 字符串转为基本数据类型
        int i1 = Integer.parseInt(string);
        System.out.println("i1 = " + i1);

    }
}
