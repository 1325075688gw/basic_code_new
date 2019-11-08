package com.biggw.day15.demo02;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 20:57
 */
public class Demo01ThreadSecrity {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        // 一个实现类,开启三个线程,这样才会出现线程不安全的问题
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);


        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpl implements java.lang.Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (ticket >= 1) {
            // 添加线程睡眠,可以增加出现线程不安全的几率
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "  ticket = " + ticket--);
        }
    }
}
