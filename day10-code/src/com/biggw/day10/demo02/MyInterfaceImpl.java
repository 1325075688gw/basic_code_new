package com.biggw.day10.demo02;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:01
 */
public class MyInterfaceImpl extends Fu implements MyInterfaceA, MyInterfaceB {

    @Override
    public void methodAbstractA() {
        System.out.println("我是A接口抽象方法");
    }

    @Override
    public void methodAbstractB() {
        System.out.println("我是B接口抽象方法");
    }

    @Override
    public void methodAbstractCommon() {
        System.out.println("我是AB接口抽象方法");
    }
}
