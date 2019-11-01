package com.biggw.day10.demo02;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:05
 */
public class MyMain {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.methodAbstractA();
        myInterface.methodAbstractB();
        myInterface.methodAbstractCommon();
        myInterface.methodDefault();

        /*
        我是A接口抽象方法
        我是B接口抽象方法
        我是AB接口抽象方法
        我是父类中的普通方法
        */

    }
}
