package com.biggw.day11.demo05;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 21:14
 */

/*
 * 匿名内部类
 * 如果接口的实现类（或者抽象父类的子类）只需要使用唯一得一次【实现类或者子类只用一次,但是生成的实现类对象【只能创建一个对象】,但是这个对象我们可以无限次使用,注意和匿名对象做好区别】
 * 那么这种情况下,我们就可以省略该类的定义,而改为使用匿名内部类【省略的其实就是新创建一个文件,实现接口或者实现子类】
 *
 * 匿名内部类的格式:
 * 接口名称 对象名 = new 接口名称() {
 *      // 覆盖重写所有的抽象方法
 * }
 *
 *
 * 匿名内部类格式解析:
 * */

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.method();

        MyInterface myInterface1 = new MyInterfaceImpl();
        myInterface1.method();

        MyInterface myInterface2 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类,实现抽象方法");
            }
        };

        myInterface2.method();

        new MyInterface(){
            @Override
            public void method() {
                System.out.println("匿名内部类,实现抽象方法,同时使用匿名对象");
            }
        }.method();
    }
}
