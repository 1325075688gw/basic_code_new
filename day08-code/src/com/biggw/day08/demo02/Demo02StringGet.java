package com.biggw.day08.demo02;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 20:39
 */

/*
 * String中字符串常用方法
 *
 * public int length(); 获取字符串的字符个数
 * public String concat(String str); 拼接字符串,返回拼接后的字符串,两个原串没有改变
 * public char charAt(int index); 返回指定索引值的字符
 * public int indexOf(String str); 查找字符串在原字符串中的首次出现位置,如果没有,则返回-1
 * */
public class Demo02StringGet {
    public static void main(String[] args) {
        // 获取字符串长度
        int length = "fdsafasdfadsfad".length();
        System.out.println("length = " + length);

        // 拼接字符串
        String str1 = "Hello ";
        String str2 = "Python";
        String str3;
        str3 = str1.concat(str2);
        System.out.println("str3 = " + str3);

        // 获取指定索引位置的字符
        char ch = "fdafadsfasd".charAt(2);
        System.out.println("ch = " + ch);

        // 查找首次出现的位置
        int index = "fdafadsfa".indexOf("da");
        System.out.println("index = " + index);
    }
}
