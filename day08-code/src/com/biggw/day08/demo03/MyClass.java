package com.biggw.day08.demo03;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 22:45
 */

/*
 * 先加载静态代码,然后加载非静态代码
 *
 * 所以: 可以在静态方法中访问非静态变量(成员变量)和非静态方法(成员方法)
 *
 * 注意:
 * 访问静态变量和静态方法:推荐使用 ClassName.StaticMethod   ClassName.StaticVariable
 * 在静态方法里面也不能使用this
 *
 * */

public class MyClass {
    private int age;
    private static int id;

    public MyClass(int age) {
        this.age = age;
    }

    public MyClass() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        MyClass.id = id;
    }
}
