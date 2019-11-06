package com.biggw.day13.demo01;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 20:17
 */


/*
 * 哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来的地址,不是数据实际的物理地址)
 * 在Object类有一个方法,可以获取对象的哈希值
 * int hashCode() 返回对象的哈希值
 *
 * hashCode源码
 * public native int hashCode();
 * native代表该方法调用的是本地操作系统的方法
 *
 * */
public class HashCode {
    public static void main(String[] args) {
        String string1 = "2342";
        String string2 = "2342";

        System.out.println("string1.hashCode() = " + string1.hashCode());
        System.out.println("string2.hashCode() = " + string2.hashCode());

        System.out.println("\"重地\".hashCode() = " + "重地".hashCode());
        System.out.println("\"通话\".hashCode() = " + "通话".hashCode());
    }
}
