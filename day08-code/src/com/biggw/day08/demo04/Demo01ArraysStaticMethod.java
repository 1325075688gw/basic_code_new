package com.biggw.day08.demo04;

import java.util.Arrays;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 18:47
 */

/*
 * Arrays里面常用的静态方法:
 * 1.public static String toString(int[] array); 对数组转化为字符串进行数组,这样我们就不用for循环遍历输出了
 * 2.public static void sort(int[] array); 对数组进行排序（原地排序）
 *
 * 注意:
 * 如果我们想要对自定义的数据进行排序,那么我们需要对这个类要有Comparable 或者 Comparator接口的支持
 * */
public class Demo01ArraysStaticMethod {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 1};
        String str1 = Arrays.toString(array);
        System.out.println("str1 = " + str1);

        String[] str = {"aaa", "ccc", "bbb"};
        Arrays.sort(str);
        System.out.println("str = " + str);
    }
}
