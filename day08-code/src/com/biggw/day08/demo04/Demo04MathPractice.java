package com.biggw.day08.demo04;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 19:15
 */

/*
 * 题目:
 * 计算-10.8到5.9之间,绝对值大于6小于2.1的整数有多少个？
 * */
public class Demo04MathPractice {
    public static void main(String[] args) {
        int res = 0;
        for (double i = -10.8; i <= 5.9; i++) {
            // 区间内所有的整数
            double num = Math.abs(Math.ceil(i));
            if (6 < num || num < 2.1) {
                System.out.println("num = " + Math.ceil(i));
                res += 1;
            }
        }
        System.out.println("res = " + res);
        System.out.println((int) (-10.8));

        System.out.println("================");
        method();
    }

    public static void method() {
        int res = 0;
        for (int i = (int) (-10.8); i < 5.9; i++) {
            int num = Math.abs(i);
            if (6 < num || num < 2.1) {
                System.out.println("num = " + Math.ceil(i));
                res += 1;
            }
        }
        System.out.println("res2 = " + res);
    }
}
