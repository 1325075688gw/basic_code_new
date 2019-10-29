package com.biggw.day07.demo01;

import java.util.Scanner;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 22:09
 */

/*
 * 输入两个数字,计算和
 * */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a:");
        int a = scanner.nextInt();
        System.out.println("请输入b:");
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
    }
}
