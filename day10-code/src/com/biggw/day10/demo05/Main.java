package com.biggw.day10.demo05;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:46
 */
public class Main {
    public static void main(String[] args) {

        // 多态,对于成员变量的调用:编译看左,运行看左
        Fu one = new Zi();
        System.out.println("one.name1 = " + one.name1);
        System.out.println("one.name2 = " + one.name2);
        System.out.println("=================");

        // 报错,因为编译的时候,父类对象没有name3
        // System.out.println("one.name3 = " + one.name3);

        Zi two = new Zi();
        System.out.println("two.name1 = " + two.name1);
        // 子类没有,向上找父类
        System.out.println("two.name2 = " + two.name2);
        System.out.println("two.name3 = " + two.name3);
        System.out.println("=================");
        System.out.println("one.this = " + one);
        System.out.println("two.this = " + two);


        System.out.println("=================");
        one.showName1();  // 【重要】【重要】【重要】
        two.showName1();  // 【重要】【重要】【重要】

        System.out.println("=================");
        // one.showNme3();错误
        two.showName3();

        System.out.println("=================");
        one.showName2();
        two.showName2();
    }
}
