package com.biggw.day09.demo07;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 20:48
 */

/*
 * 继承关系中,构造方法的调用关系
 *
 * 1.子类构造方法中会默认隐含一个"super()"的调用,这其实相当于调用父类的无参构造方法
 * 2.我们也可以不用默认的父类构造函数,那么我们就需要显示的写出来,且父类无参构造方法super()或父类有参构造方法super(xx) 必须方在子类
 *   构造方法的的第一行
 * */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("============");
        Fu fu = new Zi(20);
    }
}

/*

父类无参构造函数
子类无参数构造函数
============
父类无参构造函数
子类带参构造函数*/
