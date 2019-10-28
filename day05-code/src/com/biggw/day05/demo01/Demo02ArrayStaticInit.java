package com.biggw.day05.demo01;
/**
 * @author gw
 * @date 2019/10/28 0028 下午 19:33
 */

/*
 * 动态初始化：（指定长度），在创建数组的时候，直接指定数组中的元素个数是多少，之后再通过其它语句给数组元素赋值。
 * 静态初始化：（指定内容），在创建数组的时候，不指定元素个数，而是直接指定数组中的具体数据。
 *
 * 静态初始化，形成的数组也有长度
 *
 * 格式：
 * 数据类型【】 数组名称 = new 数据类型【】{元素1，元素2，元素3...}
 * int[] arrayA = new int[]{1,2,3,4}
 * */
public class Demo02ArrayStaticInit {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 2, 3, 4};
        String[] arrayB = new String[]{"Python", "Java", "C++"};
    }
}

