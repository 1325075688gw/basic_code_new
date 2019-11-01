package com.biggw.day10.demo02;

/**
 * @author gw
 * @date 2019/11/1 0001 下午 15:47
 */

/*
 * 1.接口中不能定义静态代码块和构造方法
 * 2.Java中一个类的直接父类是唯一的,但是一个类可以实现多个接口
 *
 * 格式:
 * public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
 *      覆盖重写所有抽象方法
 * }
 *
 * 3.如果多个接口中的抽象方法重复,则只需覆盖重写一个即可
 * 4.如果实现类没有覆盖重写所有的抽象方法,那么实现类也必须是一个抽象类
 * 5.如果实现类实现的多个接口中,存在重复的默认方法,一定要进行覆盖重写
 *
 * 6.当实现类继承了父类,并且实现了接口,同时父类和接口中有同名方法（默认方法）,则优先使用父类中的方法
 * */
public interface MyInterfaceA {
    public abstract void methodAbstractA();

    public abstract void methodAbstractCommon();

}
