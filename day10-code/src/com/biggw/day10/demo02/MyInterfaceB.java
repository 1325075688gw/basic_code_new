package com.biggw.day10.demo02;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 15:47
 */
public interface MyInterfaceB {
    public abstract void methodAbstractB();
    public abstract void methodAbstractCommon();
    public default void methodDefault(){
        System.out.println("我是B接口里面的默认方法");
    }
}
