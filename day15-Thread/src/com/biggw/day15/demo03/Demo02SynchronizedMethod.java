package com.biggw.day15.demo03;

import javax.security.auth.kerberos.KerberosTicket;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 22:46
 */


/*
 * 同步方法:
 * 同步方法也是把代码锁住,同一时刻只让一个线程运行程序,同步方法中的锁对象是this,也即是RunnableImpl runnable = new RunnableImpl();中的runnable对象
 *
 * */
public class Demo02SynchronizedMethod {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread1 = new Thread(runnable, "线程1");
        Thread thread2 = new Thread(runnable, "线程2");
        Thread thread3 = new Thread(runnable, "线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpl implements Runnable {
    private int ticket = 100;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            saleTicket();
        }
    }

    public synchronized void saleTicket() {
        if (ticket > 0) {
            System.out.println("Thread.currentThread().getName()+\" \"+this.ticket-- = " + Thread.currentThread().getName() + " " + this.ticket--);
        } else {
            flag = false;
        }
    }
}
