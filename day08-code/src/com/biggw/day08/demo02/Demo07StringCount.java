package com.biggw.day08.demo02;

import java.util.Scanner;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 21:57
 */

/*
 * 题目：
 * 键盘输入一个字符串,统计各种字符出现的次数
 * 种类有：大写字母,小写字母,数字,其他
 *
 * */
public class Demo07StringCount {
    public static void main(String[] args) {

        System.out.print("请输入字符串：");
        // 匿名对象
        String str = new Scanner(System.in).next();
        System.out.println("str = " + str);

        // 局部变量必须先初始化才能使用
        int big = 0, samll = 0, other = 0, number = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                samll++;
            } else if ('A' <= ch && ch <= 'Z') {
                big++;
            } else if ('0' <= ch && ch <= '9') {
                number++;
            } else {
                other++;
            }
        }

        System.out.println("big = " + big);
        System.out.println("samll = " + samll);
        System.out.println("other = " + other);
        System.out.println("number = " + number);
    }
}
