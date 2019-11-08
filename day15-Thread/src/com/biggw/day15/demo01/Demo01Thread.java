package com.biggw.day15.demo01;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 16:58
 */

/*
 * 【我们可以将线程理解为:应用程序到CPU之间的一条通道】
 *
 *
 * 创建多线程的第一种方式:创建Thread子类
 * java.util.Thread类
 *
 * 实现步骤:
 *      1.创建一个Thread类的子类
 *      2.在Thread类的子类中重写run方法,里面写具体的线程任务
 *      3.创建Thread的子类对象
 *      4.调用Thread中的start方法,开启新的线程
 *          结果:obj.start()开启子线程,JVM开启主线程
 *          两个线程并发的执行,(obj.start()开启子线程, JVM执行main方法,开启一条通向CPU的路径:这条路径叫main线程,用来执行main方法)
 *
 *          多次启动一个线程是非法的,特别是当线程已经结束执行后,不能再重新启动
 *
 * java程序属于抢占式调度,哪个线程的优先级高,就优先执行,同一优先级,随机执行
 * 在Java中,每次运行程序至少启动两个线程,一个是main线程,一个是垃圾回收线程,因为每当使用java命令执行一个类的时候,实际上会启动一个JVM,每一个JVM其实是在操作系统中启动了一个进程
 * */
public class Demo01Thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        // 注意 run()方法,知识一个普通方法,并不会创建一个线程
        for (int i = 0; i < 300; i++) {
            System.out.println("主线程: " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // super.run();
        for (int i = 0; i < 300; i++) {
            System.out.println("子线程: " + i);
        }
    }
}
