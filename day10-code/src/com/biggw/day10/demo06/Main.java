package com.biggw.day10.demo06;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 15:32
 */
public class Main {
    public static void main(String[] args) {

        // 向上转型,（小转大）
        // double a = 100; (int 100 转为 double)
        Animal animal1 = new Cat();
        animal1.eat();

        // 编译看左,没有,所以报错
        // animal.sleep();
        // 为了能够运行sleep方法,我们需要将animal向下转型为Cat
        // 子类名称 对象名 = (子类名称) 父类对象
        Cat cat = (Cat) animal1;
        cat.sleep();

        // 或者直接创建Cat对象调用sleep()
        Cat cat1 = new Cat();
        cat1.sleep();

        System.out.println("==============");
        System.out.println("cat  = " + (cat instanceof Animal));
        System.out.println("cat1  = " + (cat1 instanceof Animal));


        Animal animal2 = new Dog();

        giveMeAPet(animal1);
        giveMeAPet(animal2);
    }

    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eat();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
        }
    }
}
