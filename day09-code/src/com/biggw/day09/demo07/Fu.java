package com.biggw.day09.demo07;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 20:48
 */
public class Fu {
    int age = 0;

    public Fu() {
        System.out.println("父类无参构造函数");
    }

    public Fu(int age) {
        this.age = age;
        System.out.println("父类带参构造函数");
    }
}
