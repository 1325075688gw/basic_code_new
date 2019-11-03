package com.biggw.day12.demo03;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 22:28
 */

public class Demo05EClass {
    public static void main(String[] args) {
        Test<Integer> test = new Test<Integer>();
        test.setAge(12);
        System.out.println("test.getAge() = " + test.getAge());

        test.EMethod(23);
        Test.EStaticMethod(4);
    }
}


/*
 * 自定义类指定泛型
 * 创建对象时候确定泛型的类型
 * */
class Test<E> {
    private E age;

    public Test() {
    }

    public Test(E age) {
        this.age = age;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    // 创建带有泛型的成员方法
    public <M> void EMethod(M age) {
        System.out.println("创建带有泛型的成员方法");
        System.out.println("age = " + age);
        System.out.println(age.getClass());
        System.out.println(age.getClass().getName());
        System.out.println(age.getClass().getName().toString());
    }

    // 创建带有泛型的静态方法
    public static <H> void EStaticMethod(H age) {
        System.out.println("创建带有泛型的静态方法");
        System.out.println("age = " + age);
    }
}
