package com.biggw.day15.demo01;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 18:50
 */

/*
 * Thread里面的成员方法,getName()
 *      1.使用public String getName();获取线程的名称
 *      2.使用静态方法currentThread()先获取当前线程,然后使用现成中的getName()方法获取线程的名字
 *          public static Thread currentThread()
 *
 * Thread设置线程名
 *      1.public void setName()
 *      2.new MyThread("名字")
 *
 * */
public class Demo02GetThreadName {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        // 如果想获取主线程的name,必须使用静态方法,因为类Demo02GetThreadName没有继承Thread,所以无法调用getName()方法
        System.out.println("==================");
        Thread.currentThread().setName("我是主线程，自定义名字");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("==================");

        // 如果子类不手动添加两个构造方法,(带参构造方法和无参构造方法),那么子类只会有无参构造方法
        MyThread1 myThread11 = new MyThread1("小强");
        myThread11.start();
        System.out.println("==================");
        MyThread1 myThread12 = new MyThread1();
        myThread12.setName("自定义线程名");
        myThread12.start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("this.getName() = " + this.getName());
//        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }

    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }
}

//==================
//Thread.currentThread().getName() = main
//this.getName() = Thread-0
//Thread.currentThread().getName() = Thread-0
