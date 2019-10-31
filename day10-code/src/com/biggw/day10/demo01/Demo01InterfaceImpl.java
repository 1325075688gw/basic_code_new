package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 23:37
 */

/*
 * 但凡有一个抽象方法没实现,那么这么类就是抽象类,也就不能new对象,同时还要在这个类前面加上abstract关键字
 * */
public class Demo01InterfaceImpl implements Demo01Interface {
    @Override
    public void abstractMethod1() {
        System.out.println("第一个抽象方法");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("第二个抽象方法");
    }

    @Override
    public void abstractMethod3() {
        System.out.println("第三个抽象方法");
    }

    @Override
    public void abstractMethod4() {

    }

}
