package com.biggw.day08.demo02;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 17:21
 */

/*
 * ==: 当时基本类型时候,是进行内容比较,当引用类型时候,是进行地址值的比较
 * equals: 是进行对象内容的比较
 *
 * public boolean equals(Object obj){}: 参数可以是任意对象
 * 只有参数是一个字符串并且字符串的内容相同才会返回true,否则返回false
 *
 * 注意事项:
 * 1.任何对象都能用Object接收
 * 2.equals方法具对称性,a.equals(b) == b.equals(a)
 * 3.如果一个常量和一个变量进行比较,推荐把字符常量写在前面
 * 比如: "abc".equals(str) 推荐   str.equals("abc") 不推荐
 *
 * public boolean equalsIgnoreCase(Object obj) 忽略大小写,进行内容比较
 *
 * */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(array);

        System.out.println("相等：" + str1.equals(str2));
        // 字符串和字节数组底层虽然都是保存的字节数组,但是他们不equals
        System.out.println("相等：" + str1.equals(array));
        // 推荐写法
        System.out.println("相等：" + "Hello".equals(array));
        System.out.println("相等：" + str1.equals(str3));

        String str4 = null;
        // 会报错误：NullPointerException
        System.out.println("相等：" + str4.equals(array));
        // 不区分大小写
        System.out.println("相等：" + "hello".equalsIgnoreCase(str1));

    }
}
