package com.biggw.day10.demo03;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:15
 */

/*
 * 接口中的多继承
 * */
public interface MyInterfaceZi extends MyInterfaceA, MyInterfaceB {

    @Override
    public default void methodDefaultCommon() {
        System.out.println("覆盖重写公共默认方法,并且加上default");
    }
}
