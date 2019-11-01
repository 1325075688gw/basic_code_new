package com.biggw.day10.demo03;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:12
 */
public interface MyInterfaceA {
    public default void methodA(){
        System.out.println("A接口默认方法");
    }
    public default void methodDefaultCommon(){
        System.out.println("公共默认方法");
    }
}
