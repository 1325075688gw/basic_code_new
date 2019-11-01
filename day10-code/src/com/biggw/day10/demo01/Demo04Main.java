package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 15:12
 */
public class Demo04Main {
    public static void main(String[] args) {
        Demo04InterfacePrivate.methodStatic1();
        Demo04InterfacePrivate.methodStatic2();

        Demo04InterfacePrivateImpl one = new Demo04InterfacePrivateImpl();
        one.methodDefault1();
        one.methodDefault2();
    }
}
