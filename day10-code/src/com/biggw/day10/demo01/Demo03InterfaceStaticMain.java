package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 14:33
 */
public class Demo03InterfaceStaticMain {
    public static void main(String[] args) {
        Demo03InterfaceStaticImpl one = new Demo03InterfaceStaticImpl();

        // 错误
        // one.methodStatic();

        // 静态方法直接通过接口,调用
        Demo03InterfaceStatic.methodStatic();
    }
}
