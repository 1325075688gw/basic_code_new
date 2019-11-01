package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 23:16
 */

/*
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型,最重要的就是其中的 【抽象方法】
 *
 * 如何定义一个借口
 * public interface 接口名称{
 *      接口内容
 * }
 *
 * 备注：接口用关键字interface后,编译生成的仍然是.class
 *
 * 如果是Java 7 ,那么接口中包含的内容有
 * 1.常量
 * 2.抽象方法
 *
 * 如果是Java 8 ,那么接口中包含
 * 3.默认方法
 * 4.静态方法
 *
 * 如果是Java 9 ,那么接口中包含有
 * 5.私有方法
 *
 * 接口不能直接使用,必须有一个"实现类"实现该接口
 * public class 实现类名称 implements 接口名称{
 *      实现抽象方法
 * }
 *
 * 接口当中定义抽象方法：public abstract returnType methodName();
 * public abstract 可以省略
 *
 * */
public interface Demo01Interface {
    public abstract void abstractMethod1();

    abstract void abstractMethod2();

    public void abstractMethod3();

    void abstractMethod4();

}
