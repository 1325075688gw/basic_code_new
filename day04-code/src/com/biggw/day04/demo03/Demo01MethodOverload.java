package com.biggw.day04.demo03;

import javax.tools.ForwardingJavaFileManager;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 16:51
 */


/*
 * 对于功能类似的方法，因为参数列表的不一样，却需要定义不同的方法名称，太麻烦。
 *
 * 方法的重载（OverLoad）,多个方法的名称一样，但是参数列表不一样。
 *
 * 方法的重载：（前提：方法的名称相同）
 * 1.参数的个数不同
 * 2.参数的个数相同，但是类型不同
 * 3.参数的个数相同，但是类型顺序不同
 *
 *
 * 方法的重载与下列因素无关
 * 1.与参数的名称无关
 * 2.与方法的返回类型无关
 *
 * 3.与方法前面的修饰符没有关系，即有没有public没关系，有没有static没关系
 *
 * */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(mul(2, 3));
        System.out.println(mul(2, 3, 4));
    }

    // 未使用方法重载
    public static int sumTwo(int a, int b) {
        return a + b;
    }

    public static int sumThree(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumFour(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //方法的重载，我们只需要记住一个方法名称。
    public static int mul(int a, int b) {
        return a * b;
    }

    // 参数的个数不同
    public static int mul(int a, int b, int c) {
        return a * b * c;
    }

    // 参数的个数相同，类型不同
    public static int mul(int a, double b) {
        return (int) (a * b);
    }

    // 参数的个数相同，但是类型的顺序的不同
    public static int mul(double a, int b) {
        return (int) (a * b);
    }

    // 与参数的名称无关
    /*public static int mul(int c,int d){
        return c*d;
    }
    */

    //与方法的返回类型无关,因为我们单独调用的时候，不知道调用哪一个
    /* public static double mul(int a, int b){
        return a*b;
    }
    */
}
