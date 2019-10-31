package com.biggw.day09.demo02;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 19:57
 */

/*
 * 直接通过子类对象访问成员变量：
 *       等号左边是谁,就优先用谁,没有则向上找
 *
 * 间接通过成员方法访问成员变量:
 *       该方法属于谁,优先用谁,没有则向上找
 * */
public class Demo01Main {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("zi.name = " + zi.name);

        zi.method();
    }
}
