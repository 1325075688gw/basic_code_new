package com.biggw.day08.demo03;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 22:25
 */

/*
 * static: （类变量）静态变量或者（类方法）静态方法
 *
 * */
public class Student {
    private int age;
    private String name;
    private int id;
    private static String banji;

    // 学号计数器（static）
    private static int numCounter;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.id = ++numCounter;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getBanji() {
        return banji;
    }

    public static void setBanji(String banji) {
        Student.banji = banji;
    }

    public static int getNumCounter() {
        return numCounter;
    }

    public static void setNumCounter(int numCounter) {
        Student.numCounter = numCounter;
    }
}

