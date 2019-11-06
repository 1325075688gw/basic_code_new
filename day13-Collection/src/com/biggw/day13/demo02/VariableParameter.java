package com.biggw.day13.demo02;

import java.util.Objects;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 21:29
 */


/*
 * 可变参数 JDK 1.5及之后
 * 使用前提:
 *      当方法的参数类型已经确定,但是参数的个数不确定,就可以使用可变参数
 * 使用格式:
 *      定义方法时候使用
 * 可变参数的原理:
 *      可变参数底层是一个数组,根据传递参数个数的不同,会创建不同长度的数组,来存储这些参数,
 *      参数的传递个数:可以是0个【重要】,1,2,3....个
 *
 * 可变参数注意事项:
 *      1.一个方法的参数列表中,可变参数最多可以使用一次
 *          public void func(int...arr, double...arr2)   错误
 *      2.如果方法的参数有多个,那么可变参数应该写在参数列表的末尾
 *          public void func(int a, int b, int...arr)    正确
 *          public void func(int...arr, int a)           错误
 *      3.可变参数的类型如果是Object,则可以接受任意类型的数据
 *          public void func(Object...arr)
 *
 * */
public class VariableParameter {
    public static void main(String[] args) {
        func(1, 2, 3, 4);
        func();

        System.out.println("================");
        func1(1, 2, "a", "fd", 'r');
        func1();
    }

    public static void func(int... arr) {
        System.out.println("arr.getClass().getName() = " + arr.getClass());
        System.out.println("arr.length = " + arr.length);
    }

    public static void func1(Object... arr) {
        System.out.println("arr = " + arr);
        System.out.println("arr.length = " + arr.length);
        for (Object o : arr) {
            System.out.println("o = " + o);
        }
    }
}
