package com.biggw.day08.demo04;

import java.util.Arrays;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 18:55
 */

/*
 * 题目: 请使用Arrays相关的API,将一个随机字符串中的所有字符升序排列,并倒序打印
 *  */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str = "fadsfadaGSFgrsdfgGSDFG";
        char[] array = str.toCharArray();
        Arrays.sort(array);

        String str2 = "";
        for (int i = array.length - 1; i >= 0; i--) {
            str2 += array[i];
        }

        System.out.println("str2 = " + str2);
    }
}
