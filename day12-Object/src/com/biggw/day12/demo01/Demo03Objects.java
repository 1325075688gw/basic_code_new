package com.biggw.day12.demo01;

import java.util.Objects;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 13:52
 */

/*
 * Objects是JDK 7添加的一个工具类,里面体哦那个了一些静态方法,这些方法是null-save(空指针安全)或者null-tolerant(容忍空指针)的,
 * 1.计算对象的hashcode
 * 2.返回对象的字符串表示
 * 3.比较两个对象
 *
 * 比较两个对象时候,Object里面的equals方法容易抛出空指针异常,这时候我们就可以借助Objects里面提供的方法,来解决这个问题
 *
 * 源码:
 * public static boolean equals(Object a, Object b){
 *      return (a==b) || (a!=null && a.equals(b));
 * }
 *
 * */
public class Demo03Objects {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = null;

        // NullPointerException 空指针异常
        boolean equal;
//        equal = str2.equals(str1);
//        System.out.println("equal = " + equal);

        equal = Objects.equals(str1, str2);
        System.out.println("equal = " + equal);


    }
}
