package com.biggw.day10.demo06;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 15:32
 */
public class Main {
    public static void main(String[] args) {

        // 向上转型,（小转大）
        // double a = 100; (int 100 转为 double)
        Animal animal = new Cat();
        animal.eat();

        // 编译看左,没有,所以报错
        // animal.sleep();
        // 为了能够运行sleep方法,我们需要将animal向下转型为Cat
        // 子类名称 对象名 = (子类名称) 父类对象
        Cat cat = (Cat) animal;
        cat.sleep();

        // 或者直接创建Cat对象调用sleep()
        Cat cat1 = new Cat();
        cat1.sleep();

    }
}
