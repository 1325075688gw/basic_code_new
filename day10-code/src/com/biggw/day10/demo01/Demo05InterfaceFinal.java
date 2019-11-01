package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 15:21
 */

/*
 * jdk 7 开始,接口中允许定义常量
 *
 * 常量定义规则:
 * public static final 类型 名称 = 赋值;
 *
 * 注意:
 * 1.接口中的常量,必须赋初值
 * 2.接口中的常量名,必须大写,各个字母之间用下划线连接
 * 3.
 * */
public interface Demo05InterfaceFinal {
    public static final int NUM_OF_MY_CLASS = 10;
}
