package com.biggw.day08.demo03;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 22:51
 */
public class Demo02MyClass {
    public static void main(String[] args) {
        // 在本类中静态方法,可以不用类名调用
        staticMethod();
        Demo02MyClass.staticMethod();
    }

    private static void staticMethod() {
        System.out.println("这是一个静态方法！");
    }
}
