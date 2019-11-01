package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 14:29
 */

/*
 * JDK8开始,接口中允许定义静态方法
 *
 * public static 返回值类型 方法名称(参数列表){
 *      方法体
 * }
 * */
public interface Demo03InterfaceStatic {
    public static void methodStatic() {
        System.out.println("这是接口里面的静态方法");
    }
}
