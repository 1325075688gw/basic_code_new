package com.biggw.day08.demo02;

import java.util.Arrays;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 21:09
 */

/*
 * String 中转换相关方法
 *
 * public char[] toCharArray(); 将当前字符串转化为字符数组
 * public byte[] getBytes(); 将当前字符串转化为字节数组
 * public String replace(Charsequence oldString, Charsequence newString); 将所有出现的oldString替换为newString
 *
 *Charsequence:接口
 * */
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        byte[] bytes = "Hello".getBytes();
        System.out.println("chars = " + chars);
        System.out.println("bytes = " + bytes);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(bytes));

        String str1 = "你好,大灰狼！";
        String str2 = str1.replace("大灰狼", "小红帽");
        System.out.println("str2 = " + str2);
    }
}
