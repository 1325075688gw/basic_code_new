package com.biggw.day15.demo01;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 19:34
 */

/*
 * 实现多线程的第二个方法
 * 实现Runnable接口里面的run方法,并创建Runnable实现类对象,之后将该对象作为参数传递到Thread构造方法中
 *
 *
 * 实现Runnable接口，来创建多线程有什么好处
 *      1.避免了单继承的局限性
 *          Java中一个类只能继承一个父类,子类继承了Thread类后就不能继承其他的类
 *          implements Runnable接口后,可以继承其它类和接口
 *      2.增强了程序的扩展性,降低了程序的耦合性
 *          ====>我们的子类是我们要用的类,而不是专门为extends Thread而创建的,所以这儿用Runnable更好
 *          如果我们通过集成Thread来实现多线程,那么我们只有一个run()方法,如果想实现其他多线程任务,就不可能了
 *          但是如果我们实现implements Runnable接口,我们可以定义多个Runnable的实现接口,在里面定义不同的run()方法,所以,扩展性更强
 *      3.线程池只能放入实现Runable或Callable类线程,不能直接放入继承的Thread类
 *
 * 在Java中,每次运行程序至少启动两个线程,一个是main线程,一个是垃圾回收线程,因为每当使用java命令执行一个类的时候,实际上会启动一个JVM,每一个JVM其实是在操作系统中启动了一个进程
 *
 *
 *
 * 匿名内部类:简化代码
 *      把子类继承父类,重写父类的方法,创建子类对象,三步合为一步
 *      把实现类实现接口,重写接口中的方法,创建实现类对象,三步合为一步
 * 匿名内部类的最终产物:子类/实现类对象,而这个类没有名字
 *
 *
 *
 *
 *
 * */
public class Demo04ThreadRunable {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("================");

        // 匿名内部类实现
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                System.out.println("thread.getName() = " + thread1.getName());  错误
                System.out.println("thread.getName() = " + Thread.currentThread().getName());
            }
        });
        thread1.start();

        // 匿名内部类2
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread.getName2() = " + Thread.currentThread().getName());

            }
        }, "匿名内部类").start();
        System.out.println("fadf");
    }
}


class RunnableImpl implements Runnable {
    @Override
    public void run() {
        // public class Thread implements Runnable
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
