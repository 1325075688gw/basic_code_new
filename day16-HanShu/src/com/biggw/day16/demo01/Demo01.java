package com.biggw.day16.demo01;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 21:24
 */


/*
 * 对于Runnable匿名内部类,
 * 1.我们需要实现Runnabel接口里面的run()方法,然后创建Runnable接口对象...这期间我们需要重写run()方法,run()方法的参数,名字,返回值还不能写错,但是真正有用的也就是run()方法内部的一句话
 *
 *
 * */
public class Demo01 {
    public static void main(String[] args) {
        new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        }.makeFood();

        Cook cook = () -> {
            System.out.println("吃饭了");
        };
        cook.makeFood();


        invokeCook(
                new Cook() {
                    @Override
                    public void makeFood() {
                        System.out.println("吃饭了");
                    }
                }
        );

        // 使用lambda表达式,简化匿名内部类的书写（实现类对象，和子类对象都算）
        invokeCook(() -> {
            System.out.println("吃饭啦");
        });

        // 省略
        invokeCook(()->System.out.println("吃饭啦"));

    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}


interface Cook {
    void makeFood();
}