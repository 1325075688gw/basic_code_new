package com.biggw.day04.demo03;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 19:06
 */

/*
* 在调用输出语句时候，println帮我实现了重载
* */
public class Demo04MethodOverloadPrint {
    public static void main(String[] args) {
        // 点击原函数println进去可以发现，里面都是通过重载实现，不同类型的输出
    }

    public static void myPrint(byte num){
        System.out.println("num = " + num);
    }

    public static void myPrint(int num){
        System.out.println("num = " + num);
    }

    public static void myPrint(short num){
        System.out.println("num = " + num);
    }

    public static void myPrint(float num){
        System.out.println("num = " + num);
    }

    public static void myPrint(long num){
        System.out.println("num = " + num);
    }

    public static void myPrint(double num){
        System.out.println("num = " + num);
    }
}
