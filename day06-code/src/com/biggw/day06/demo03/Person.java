package com.biggw.day06.demo03;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 20:10
 */
public class Person {
    private String name;
    private int age;
    private boolean male;


    // 基本类型中的boolean,返回时,用is
    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
