package com.biggw.day07.demo03;

import java.util.Random;

/**
 * @author gw
 * @date 2019/10/30 0030 上午 10:26
 */


/*
 * Random类用来生成随机数字,只要不是8种基本数据类型,则都是引用类型,所以Random是引用类型
 *
 * 引用类型使用有三个步骤：
 * 1.导包
 * import java.util.Random;
 *
 * 2.创建对象
 * Random r = new Random();  选择无参构造函数
 *
 * 3.使用(也就是使用成员方法)
 * int a = r.nextInt();   获取一个int随机数字,范围是int所有范围,包括正负
 * int a = r.nextInt(3);  获取左闭右开区间,[0,3)
 *
 * */
public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("a = " + a);

        func(new Random());
    }

    public static void func(Random random) {
        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(10);
            System.out.println("a = " + a);
        }
    }
}
