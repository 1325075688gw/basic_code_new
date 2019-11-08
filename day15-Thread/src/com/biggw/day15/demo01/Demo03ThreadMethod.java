package com.biggw.day15.demo01;

import com.sun.source.tree.NewArrayTree;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 19:24
 */

/*
 * public static void sleep(long mills):让当前正在执行的线程以指定的毫秒数暂停
 *
 * */
public class Demo03ThreadMethod {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        myThread3.start();
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            try {
                MyThread3.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i = " + i);
        }
    }
}
