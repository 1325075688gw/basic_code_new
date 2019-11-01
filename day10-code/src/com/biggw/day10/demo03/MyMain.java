package com.biggw.day10.demo03;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:18
 */
public class MyMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.methodA();
        myClass.methodB();
        myClass.methodDefaultCommon();

        /*
        A接口默认方法
        B接口默认方法
        覆盖重写公共默认方法,并且加上default
        */
    }
}
