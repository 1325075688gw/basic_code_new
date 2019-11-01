package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 23:48
 */
public class Demo02InterfaceDefaultA implements Demo02InterfaceDefault {
    @Override
    public void abstractMethod() {
        System.out.println("A实现接口抽象方法");
    }

    @Override
    public void newAddDefault() {
        System.out.println("A类覆盖重写接口默认方法");
    }
}
