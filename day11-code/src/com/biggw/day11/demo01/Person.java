package com.biggw.day11.demo01;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 17:16
 */


/*
 * 只有局部变量才不会默认赋值,成员变量和类变量都会进行默认赋值,但是我们要注意,
 * 一旦我们成员变量或者类变量变成了final,那么系统将不会提供默认赋值,所以我们需要手动赋值。
 *
 * 或者我们不进行手动赋值,但是我们的所有构造方法都必须对final的成员变量进行复制
 * */
public class Person {
    String name = "高圆圆";
    static final String localClass = "邯郸";
    final String localMenber = "重庆";
    final String localMenber2;

    public Person(String name, String localMenber2) {
        this.name = name;
        this.localMenber2 = localMenber2;
    }

    public Person() {
        this.localMenber2 = "佟大为";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getLocalClass() {
        return localClass;
    }

    public String getLocalMenber() {
        return localMenber;
    }

    public String getLocalMenber2() {
        return localMenber2;
    }
}
