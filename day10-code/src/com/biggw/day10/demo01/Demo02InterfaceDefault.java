package com.biggw.day10.demo01;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 23:46
 */

/*
 * 从 JDK 8开始,接口允许定义默认方法
 *
 * 默认方法用来解决接口升级的问题,我们在接口里面多多定义了两个方法,但是我们不想修改我们的实现类,而拥有该方法,我们就需要借助默认方法帮助
 * 默认方法,会被实现类继承下去
 *
 * 默认方法就多了一个关键字default
 * public default 返回值类型 方法名称(参数列表){
 *      方法体;
 * }
 *
 * 接口里面的默认方法,可以被实现类覆盖重写
 * */
public interface Demo02InterfaceDefault {
    public abstract void abstractMethod();

    public default void newAddDefault() {
        System.out.println("我是新添加的默认方法,我用来解决接口升级的问题!");
    }
}
