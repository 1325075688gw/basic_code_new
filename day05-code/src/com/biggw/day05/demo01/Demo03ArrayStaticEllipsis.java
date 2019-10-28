package com.biggw.day05.demo01;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 19:42
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
 *
 * 省略格式：（静态初始化）
 * 数据类型【】 数组名称 = {元素1，元素2，元素3...}
 * int[] arrayA = {1,2,3,4}
 *
 *
 *
 * 注意：
 * 1.静态初始化和动态初始化都可以拆分成两个步骤
 * 2.静态初始化一旦使用省略格式，就不能拆分为两个步骤
 *
 *
 * 使用建议：
 * 当不确定数组内容时候，我们用动态初始化；当确定具体内容时候，我们用静态初始化
 * */
public class Demo03ArrayStaticEllipsis {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};
        String[] arrayB = {"Python", "Java", "C++"};

        // 动态初始化拆分成两个步骤
        int[] arrayC;
        arrayC = new int[10];

        // 静态初始化拆分成两个步骤
        int[] arrayD;
        arrayD = new int[]{1, 2, 3, 4};

        // 静态初始化一旦使用省略格式，就不能拆分为两个步骤
//        int[] arrayE;
//        arrayE = {1, 2, 3, 4}

    }
}