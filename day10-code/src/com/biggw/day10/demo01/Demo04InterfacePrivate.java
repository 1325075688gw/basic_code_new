package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 14:58
 */

/*
 * Java 9 及更高版本才有私有方法
 * private 关键字修饰的方法,只有本类才能访问,连子类都不能访问
 *
 * 有时候,我们的多个默认方法和多个静态方法之间公用了大量的代码,这时侯我们需要抽离出来共有部分,让默认方法和静态方法调用,但是我们不希望实现类
 * 调用,所以我们加上关键字private.将该方法变成普通私有方法和静态私有方法
 *
 * 普通私有方法: 解决多个默认方法之间的代码重复问题
 * private 返回值类型 方法名称(参数列表){
 *      方法体
 * }
 *
 * 静态私有方法: 解决多个静态方法之间的代码重复问题
 * private static 返回值类型 方法名称(参数列表){
 *      方法体
 * }
 * */
public interface Demo04InterfacePrivate {
    public default void methodDefault1() {
        System.out.println("默认方法1");
        methodPrivateDefault();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
        methodPrivateDefault();
    }

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodPrivateStatic();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodPrivateStatic();
    }

    private void methodPrivateDefault() {
        System.out.println("我是普通私有方法,供默认方法调用");
    }

    private static void methodPrivateStatic() {
        System.out.println("我是静态私有方法,供静态方法调用");
    }
}
