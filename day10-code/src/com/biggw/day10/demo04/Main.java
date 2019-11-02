package com.biggw.day10.demo04;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 16:34
 */
public class Main {
    public static void main(String[] args) {
        // 多态

        /*
         * 父类引用指向子类对象
         *
         * 父类名称 对象名 = new 子类名称();     extends
         *
         * 接口名称 对象名 = new 实现类名称();   implments
         *
         * 方法：
         * 编译看左,运行看右
         * */
        Fu one = new Zi();
        one.methodCommon();
        one.methodFu();
        System.out.println("=================");

        Zi zi = new Zi();
        zi.methodCommon();
        zi.methodZi();
        zi.methodFu();
        System.out.println("=================");

        Fu fu = new Fu();
        fu.methodFu();
        fu.methodCommon();
    }
}
