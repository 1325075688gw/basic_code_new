package com.biggw.day11.demo03;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 19:52
 */
public class Demo02OuterMain {
    public static void main(String[] args) {
        Outer.Inter inter = new Outer().new Inter();
        inter.interMethod();
    }
}
