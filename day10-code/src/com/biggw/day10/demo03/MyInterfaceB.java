package com.biggw.day10.demo03;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:13
 */
public interface MyInterfaceB {
    public default void methodB(){
        System.out.println("B接口默认方法");
    }

    public default void methodDefaultCommon(){
        System.out.println("公共默认方法");
    }
}
