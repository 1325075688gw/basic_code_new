package com.biggw.day09.demo07;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 20:48
 */
public class Zi extends Fu {
    public Zi(int age) {
        // 默认隐含了一个父类的无参构造方法
        // super()

        // 调用本类的无参构造函数,而且super和this构造函数只能同时用一个
//        this();
        System.out.println("子类带参构造函数");
    }

    public Zi() {
        // 默认隐含了一个父类的构造方法
//         super()

        System.out.println("子类无参数构造函数");
    }
}
