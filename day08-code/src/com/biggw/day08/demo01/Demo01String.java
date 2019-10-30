package com.biggw.day08.demo01;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 15:21
 */

/*
 * Java中的String是字符串类
 * import java.uitl.String;
 *
 * Java程序中的所有字符串字面值(如"abc")都作为此类的实例实现
 * 也就是说,程序当中所有的双引号字符串,都是String类的对象,(就算没有new String("abc")),也是String对象
 *
 * 字符串的特点:
 * 1.字符串的内容永远都不可变 【重点】
 * 2.因为字符串内容不可改变,所以为了节省内存,我们将字符串共享使用
 * 3.字符串效果相当于char【】字符数组,但是底层原理都是byte【】字节数组
 *
 * 创建字符串的四种方式
 * 1.public String(); 创建一个空白字符串,不含有任何内容
 * 2.public String(char[] array); 根据字符串数组的内容,来创建对应的字符串（效果上是字符数组）
 * 3.public String(byte[] array); 根据字节数组的内容,来创建对应的字符串 （底层存储都是字节数组）
 *
 * 4.最后一种直接创建,我们直接 String str4 = "abc4"; 实际上也会调用 new 方法实现创建字符串对象
 *
 * */
public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String("abc");
        System.out.println("str1 = " + str1);

        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println("str2 = " + str2);

        byte[] byteArray = {97, 98, 100};
        String str3 = new String(byteArray);
        System.out.println("str3 = " + str3);

        String str4 = "abc4";
        System.out.println("str4 = " + str4);
    }
}