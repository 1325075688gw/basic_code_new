package com.biggw.day15.demo03;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 23:02
 */

/*
 * 静态同步方法
 *
 *
 * */
public class Demo03StaticSynchronizedMethod {
    public static void main(String[] args) {
        RunnableImpl4 runnable = new RunnableImpl4();
        Thread thread1 = new Thread(runnable, "线程1");
        Thread thread2 = new Thread(runnable, "线程2");
        Thread thread3 = new Thread(runnable, "线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpl4 implements Runnable {
    private static int ticket = 100;
    private static boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            // 静态代码可以不用类名调用
            saleTicket();
        }
    }

    public static synchronized void saleTicket() {
        // 不能使用this作为同步锁,因为静态方法在对象创建之前
        if (ticket > 0) {
            System.out.println("Thread.currentThread().getName()+\" \"+this.ticket-- = " + Thread.currentThread().getName() + " " + ticket--);
        } else {
            flag = false;
        }
    }
/*
    public static void saleTicket() {
        【使用的同步锁对象是本类的class属性,class文件对象(反射技术)】
        synchronized(RunnableImpl4.class){
            // 不能使用this作为同步锁,因为静态方法在对象创建之前
            if (ticket > 0) {
                System.out.println("Thread.currentThread().getName()+\" \"+this.ticket-- = " + Thread.currentThread().getName() + " " + ticket--);
            } else {
                flag = false;
            }
        }
    }
 */
}

