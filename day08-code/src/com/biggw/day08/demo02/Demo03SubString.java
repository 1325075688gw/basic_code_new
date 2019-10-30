package com.biggw.day08.demo02;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 20:52
 */

/*
 * 字符串截取方法:
 *
 * public String substring(int begin); 截取从begin开始,到字符串末尾
 * public Strng substring(int begin, int end); 截取左闭右开的字符串
 *
 * */
public class Demo03SubString {
    public static void main(String[] args) {
        String str1 = "Hello Python,Wellcom";
        String str2 = str1.substring(str1.indexOf('P'));

        // 字符串在Java中是不可改变的,所以,我们见到的新字符串都是新创建的
        System.out.println("str1 = " + str1); // Hello Python 原封不动
        System.out.println("str2 = " + str2); // Python 新创建的字符串
        String str3 = str1.substring(str1.indexOf('P'), str1.indexOf(','));
        System.out.println("str3 = " + str3);
    }
}
