package com.biggw.day10.demo05;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:45
 */
public class Zi extends Fu {
    // @Override 成员变量没有覆盖重写一说
    String name1 = "子类1";


    String name3 = "子类3";

    @Override
    public void showName2() {
        System.out.println(this);
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
    }

    public void showName3() {
        System.out.println(this);
        System.out.println("name1 = " + name1);
    }

    @Override
    public void showName1() {
        // System.out.println("this = " + this);
        // 无限循环
        // this.showName1();


        // 这才是继承的本质 【重要】【重要】【重要】也就是说用的是父类的name1,而不是子类的name1
        super.showName1();
    }
}
