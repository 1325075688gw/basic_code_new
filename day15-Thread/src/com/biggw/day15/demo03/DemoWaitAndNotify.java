package com.biggw.day15.demo03;

import java.util.Objects;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 16:17
 */


/*
 * Object类中的成员方法wait：永久睡眠状态，只有通过Object类中的成员方法notify来进行唤醒
 *
 * 顾客和老板两个线程,必须只用同步代码块包起来,保证等待和唤醒只能有一个在执行
 * 同步使用的锁对象必须保证唯一
 *
 * Object中的方法:
 * void wait()
 *      在其它线程调用此对象的notify()方法或者notifyAll()方法之前,线程无限睡眠
 * void notify()
 *      唤醒在此对象监视器上等待的单个线程
 *      之后继续执行wait()语句后面的代码
 *
 * 进入到等待计算的两种方式
 *      1.使用sleep(long mill); 在毫秒值结束后,线程唤醒进入到Runable/Blocked状态
 *      2.使用wait(long mill); wait方法如果在毫秒值结束后,没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态
 *
 *
 * */
public class DemoWaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        try {
                            System.out.println("老板我想吃红糖馅的包子");
                            // 调用wait()方法,放弃CPU的执行权,进入到WAITING状态(无限等待)
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后的代码
                        System.out.println("包子真好吃,我还想吃");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){

                        System.out.println("包子做好了");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}


// 多个线程在处理同一个资源,但是处理的动作(线程的任务)不一样
// 比如线程A用来生成包子,线程B用来吃包子,包子可以理解为同一资源,线程A是生产,线程B是消费,那么线程A和线程B之间就会存在线程间的通信问题

// 为什么需要处理线程间的通信
// 多个线程并发执行时候,默认情况下CPU是随机切换线程的,当我们需要多个线程共同完成一个任务的时候,且他们共同操作一个数据资源,那么我们就
// 希望各个线程有规律的执行,这样才能保证资源的安全.那么这时候我们多线程之间就去要一些协调,来保证数据的安全.而这种控制多个线程对资源的有效利用手段就是"等待唤醒机制"

// 通知了等待的线程,被通知的线程也不能立刻恢复执行,因为它当初中断的地方是同步块里面的,而此刻它已经不在持有锁,所以他需要再次尝试获取锁(很可能面临其他锁的竞争),成功后
// 才能调用当初wait后面的语句