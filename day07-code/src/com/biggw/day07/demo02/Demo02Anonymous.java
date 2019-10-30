package com.biggw.day07.demo02;

import java.util.Scanner;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 22:42
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        // 普通对象使用方式
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入a:");
        int a = scanner.nextInt();
        System.out.println("a = " + a);


        // 匿名对象使用方式
        System.out.print("请输入b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("b = " + b);

        // 普通对象作为函数参数传递
        methodAnonymousInput(scanner);

        // 匿名对象作为函数参数传递
        methodAnonymousInput(new Scanner(System.in));

        // 普通对象作为函数的返回值
        Scanner sc1 = methodAnonymousOutput1();
        System.out.print("请输入sc1: ");
        int i1 = sc1.nextInt();
        System.out.println("sc1 = " + i1);

        // 匿名对象作为函数的返回值
        Scanner sc2 = methodAnonymousOutput2();
        System.out.print("请输入sc2: ");
        int i = sc2.nextInt();
        System.out.println("sc2 = " + i);
    }

    public static void methodAnonymousInput(Scanner sc) {
        System.out.print("请输入tmp:");
        int tmp = sc.nextInt();
        System.out.println("tmp = " + tmp);
    }

    public static Scanner methodAnonymousOutput1() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static Scanner methodAnonymousOutput2() {
        // 返回匿名对象
        return new Scanner(System.in);
    }

}
