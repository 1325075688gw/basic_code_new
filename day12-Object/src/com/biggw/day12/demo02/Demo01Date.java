package com.biggw.day12.demo02;

import java.util.Date;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 15:35
 */
public class Demo01Date {
    public static void main(String[] args) {
        String string = new String("在这！");
        System.out.println("string = " + string);
        System.out.println("string.toString() = " + string.toString());

        System.out.println("无参构造函数:"+new Date());
        System.out.println("有参参构造函数:"+new Date(13124123412L));
        System.out.println("System.currentTimeMillis" + System.currentTimeMillis());
        System.out.println("转化为毫秒值" + new Date().getTime());

    }
}
