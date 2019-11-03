package com.biggw.day12.demo02;

import java.util.Calendar;
import java.util.Date;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 17:34
 */

/*
 * Calender是一个抽象类,但是我们可以直接调用里面的getInstance()静态方法获取子类的对象
 *
 * 1.public int get(int field); 返回给定日历字段的值
 * 2.public void set(int field, int value); 将给定的日历字段设置为给定的值
 * 3.public abstract void add(int field, int amount); 将日历字段加减
 * 4.public Date getTime();将Calendar时间值转化为Date类型
 *
 * */
public class Demo03Calender {
    public static void main(String[] args) {
        func();
    }

    public static void func() {
        // 多态的使用
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);

        int year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);


        calendar.set(Calendar.YEAR, 1999);
        year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);

        calendar.add(Calendar.YEAR,1);
        year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);

        Date date = calendar.getTime();
        System.out.println("date = " + date);
    }
}
