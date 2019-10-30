package com.biggw.day08.demo01;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 16:41
 */


/*
 * 字符串常量池：从JDK 1.7+,字符串常量池放过到了堆当中
 * 我们不显式调用构造方法,直接用引号创建字符串,则都是在堆中的字符串常量池中保存字符串对象的地址,然后对象以字节数组的形式保存到堆当中(字符串常量池之外),同时栈中保存字符串常量池中
 * 字符串对象的地址
 *
 * ==: 对于基本类型,比较的两个数据的内容
 * ==: 对于引用类型,比较的是两个对象的地址值
 *
 *
 * */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] array1 = {'a', 'b', 'c'};
        String str3 = new String(array1);

        byte[] array2 = {97, 98, 99};
        String str4 = new String(array2);
        System.out.println("str4 = " + str4);

        byte[] array3 = {97, 98, 99};
        String str5 = new String(array3);
        System.out.println("str5 = " + str5);

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false
        System.out.println(str4 == str5); // false

        // 得出结论
        // 通过直接加引号创建的字符串,都是放到了字符串常量池中,也就是如果内容相同,则只保存一份
        // 如果通过char【】,byte【】作为参数,通过String的有参构造方法创建的字符串,那么不管内容相不相同,生成的字节数组的地址都不相同

        // 特别是        System.out.println(str4==str5); // false
        // 我们可以发现虽然字符串的底层保存是字节数组,即使内容相同,字节数组也不会只保存一个地址.而是两个字节数组互不影响。
    }
}
