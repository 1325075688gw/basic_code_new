package com.biggw.day15.demo06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 20:59
 */


/*
 * 线程池: JDK1.5之后提供
 * java.util.concurrent.Executors:线程池工厂类,用来生成线程池
 * Executors类中的静态方法:
 * static ExecutorService newFixedThreadPoll(int nThreads) 创建一个可重用的固定线程数量的线程池
 * 参数:
 *      int nThreads:线程池里面包含的线程数量
 * 返回值:
 *      ExecutorService接口,返回的是ExecutorService接口的实现类对象,我们可以使用ExecutorService接口接收,(面向接口编程)
 *
 *   submit(Runnable task):用来从线程池中获取一个线程,然后调用start()方法,执行线程任务
 *   void shutdown():用来关闭(销毁)线程池
 *
 *
 * 线程池的使用步骤:
 *      1.使用线程池的工厂类Executors里面的静态方法,newFixedThreadPool生产一个指定线程数量的线程池
 *      2.创建一个类,实现Runnable接口,重写run()方法,设置线程任务
 *      3.调用ExecutorsService中的方法submit(),传递线程任务,开启线程,执行run()方法
 *      4.调用ExecutorsService中的方法shutdown()销毁线程池(不建议执行)
 *
 *
 *
 * */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // 线程池会一直开启哦
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());

        //
        executorService.shutdownNow();
        // 抛异常,因为线程池都没有了
        executorService.submit(new RunnableImpl());


    }
}

class RunnableImpl implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("你好");
        System.out.println(Thread.currentThread().getName()+" 开始执行");
    }
}
