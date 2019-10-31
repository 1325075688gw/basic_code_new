package com.biggw.day08.demo11;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 21:51
 */

/*
 * 抽象方法: 就是加上abstract关键字,然后去掉大括号,直接分号结束   即不写方法体
 *
 * 如果一个类是里面含有抽象方法,那么这个类必须是抽象类,我们在class前加上abstract,
 * 抽象类里面可以含有非抽象方法
 *
 * 注意:
 * 1.抽象类不能创建对象
 * 2.抽象类可以被继承,如果一个子类想要不是抽象类,那么它必须是实现全部父类抽象方法
 * 3.子类要覆盖重写父类的抽象方法,所以推荐用关键字 @Override
 * 4.调用子类进行创建对象
 *
 * */
public abstract class Animal {
    public abstract void eat();

    public void normalMethod() {

    }
}
