package com.biggw.day11.demo03;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 19:21
 */

/*
 * 匿名内部类
 *
 * 1.成员内部内
 *  当做成员函数一样，定义在内里面,
 *  内部类可以任意调用外部类的成员函数;
 *  1.外部类必须先new内部类对象,然后用对象调用内部类的方法.
 *  2.或者 外部类.内部类 对象名称 = new 外部类().new 内部类();来访问内部类成员函数
 *
 * */
public class Body {
    public class Heart{
        public void beat(){
            System.out.println("内部类,心脏跳动!");
        }

        public void methodHeart(){
            methodBody2();
            new Body().methodBody2();
        }
    }

    public void methodBody(){
        System.out.println("外部类");
        Heart heart = new Heart();
        heart.beat();
    }

    public void methodBody2(){
        System.out.println("这是外部类");
    }
}
