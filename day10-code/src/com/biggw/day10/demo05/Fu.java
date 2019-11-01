package com.biggw.day10.demo05;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:45
 */

// 默认继承Object
public class Fu /*extends Object*/ {
    String name1 = "父类1";
    String name2 = "父类2";

    public void showName1(){
        System.out.println(this);
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
    }

    public void showName2(){
        System.out.println(this);
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
    }
}
