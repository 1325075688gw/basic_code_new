package com.biggw.day04.demo03;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 17:21
 */

/*
 * 题目要求：
 * 比较两个数据是否相等
 * 输入：两个byte数据，两个short数据，两个int数据，两个long数据
 * 输出：再main方法中体现结果
 * */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame((int) (a), (int) (b)));
        System.out.println(isSame((short) (a), (short) (b)));
        System.out.println(isSame((long) (a), (long) (b)));
        System.out.println(isSame(10L,20L));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte数据，方法执行！");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int数据，方法执行！");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short数据，方法执行！");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long数据，方法执行！");
        return a == b;
    }
}
