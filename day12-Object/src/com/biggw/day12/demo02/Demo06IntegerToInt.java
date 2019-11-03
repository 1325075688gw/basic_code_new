package com.biggw.day12.demo02;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 19:42
 */

/*
 * 装箱和拆箱
 *
 * 装箱:
 * 构造方法
 * public Integer(int i);
 * public Integer(String s);
 *
 * 静态方法
 * public static Integer valueOf(String s)
 * public static Integer valueOf(int i)
 *      这里面会去调用parseInt静态方法
 *
 * 拆箱:
 * public int intValue();
 *
 * */
public class Demo06IntegerToInt {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        Integer integer = new Integer(23);
        Integer integer1 = new Integer("232");

        Integer integer2 = Integer.valueOf(32);
        Integer integer3 = Integer.valueOf("534");

        int a = integer3.intValue();
        System.out.println(a);
    }
}
