package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 23:52
 */
public class Demo02Main {
    public static void main(String[] args) {
        Demo02InterfaceDefaultA one = new Demo02InterfaceDefaultA();
        one.abstractMethod();
        one.newAddDefault();

        Demo02InterfaceDefaultB two = new Demo02InterfaceDefaultB();
        two.abstractMethod();
        two.newAddDefault();

    }
}
