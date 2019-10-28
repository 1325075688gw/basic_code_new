package com.biggw.day04.demo02;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 16:33
 */

/*
 * 判断两个数是否相等
 */
public class DemoPractice {
    public static void main(String[] args) {
        boolean same = DemoPractice.isSame(12, 34);
        System.out.println(same);
    }

    public static boolean isSame(int a, int b) {
        boolean same;
        // same = a == b ? true : false;
        same = a == b;
        return same;
    }

    public static void method() {
        // return 有两种用途，一是返回值，而是结束当前程序。所以对于返回类型为void的函数，我们可以在里面直接return；
        return;
    }

}
