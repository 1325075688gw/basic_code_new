package com.biggw.day15.demo03;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 22:02
 */



/*
 * 同步代码块技术的原理
 * 使用一个锁对象,这个对象叫做同步锁,也叫做对象锁,也叫做监视器
 * 当多个线程一起抢夺CPU的执行权,谁先抢到就执行run()方法进行卖票
 *      t0抢到CPU的执行权,执行run()方法,遇到synchronized()代码块,这是t0会检查synchronized代码块的是否有锁对象,发现有,就会【获取锁对象】，进入到同步代码块中执行代码
 *      t1抢到了CPU的执行权,执行run()方法,遇到synchronized代码块,这时候t1会检查synchronized代码块是否有锁对象,发现没有,就会进入阻塞状态,一直等待t0将锁对象归还,
 *      t0执行完代码,归还锁对象,t1继续获取锁对象,进入同步代码块,执行代码
 *
 * 【总结:同步代码块中的线程,没有执行完,不会释放对象锁,同步代码块外面的线程,每欲呕获取到对象锁,不能进入到同步代码块中执行代码】
 *
 * */
public class Demo01Synchronized {
    public static void main(String[] args) {
        RunnableImpl1 runnable = new RunnableImpl1();
        // 一个实现类,开启三个线程,这样才会出现线程不安全的问题
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);


        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpl1 implements java.lang.Runnable {
    private int ticket = 100;

    // 放在run()方法外面,不能放在run()方法里面,因为放在里面就会生成3个对象,而同步代码快需要一个对象
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket >= 1) {
                    // 将可能出现线程安全的问题放到同步代码块中

                    // 添加线程睡眠,可以增加出现线程不安全的几率
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "  ticket = " + ticket--);
                }else {
                    break;
                }
            }
        }
    }
/**
 *  如果这样写,还是会出现线程不安全问题:
 *  Thread-1 ticket = 1
 *  Thread-2 ticket = 0
 *  Thread-0 ticket = -1
 *
 *  【仔细分析原因,因为三个线程都进入了while(ticket>1)里面,然后再用同步代码块加锁,已经无济于事了】
 *
 @Override public void run() {
 while (ticket>=1) {
 synchronized (obj) {
 // 将可能出现线程安全的问题放到同步代码块中

 // 添加线程睡眠,可以增加出现线程不安全的几率
 try {
 Thread.sleep(1);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 System.out.println(Thread.currentThread().getName() + "  ticket = " + ticket--);
 }
 }
 */
}
