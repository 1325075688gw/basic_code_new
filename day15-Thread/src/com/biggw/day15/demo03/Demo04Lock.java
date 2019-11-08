package com.biggw.day15.demo03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 15:26
 */

/*
 * 卖票出现了线程安全问题
 * 卖出了不存在的票和重复的票
 *
 * 解决线程安全的问题的第三种方法:使用Lock锁
 * java.util.conocurrent.locks.Lock接口
 * Lock实现了提供比synchronized方法和语句更广发的锁操作
 * Lock接口中的方法,
 *      void lock()获取锁
 *      void unlock()释放锁
 *
 * java.util.concurrent.locks.Reentrantlock implements Lock 接口
 *
 * 使用步骤:
 *      1.在成员位置处创建一个ReentrantLock对象
 *      2.在可能会出现线程安全问题的地方,调用Lock接口中的方法lock获取锁
 *      2.在可能会出现线程安全问题的地方后调用Lock接口中的方法unlock释放锁
 *
 *
 * */
public class Demo04Lock {
    public static void main(String[] args) {
        UnLock unLock = new UnLock();
        Thread thread = new Thread(unLock, "卖票线程");
        thread.start();

    }
}

class UnLock implements Runnable {
    private int ticket = 100;

    Lock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(1);
                    System.out.println("Thread.currentThread().getName()+\" 卖出第\" +ticket+\"张票\" = " + Thread.currentThread().getName() + " 卖出第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }
    }
}