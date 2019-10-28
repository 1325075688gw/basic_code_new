package com.biggw.day05.demo01;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 20:09
 */

/*
 *
 * 动态数组，有默认的初始值
 *
 * 如果是整数类型，默认值为0
 * 如果是浮点数类型，默认值为0.0
 * 如果是字符类型，默认值是'\u0000'
 * 如果是布尔类型，默认是false
 * 如果是引用类型，默认是null
 *
 * 注意事项：
 * 静态数组也有默认值的过程，只不过系统马上就用大括号中的数据将默认值替换了。
 * */

public class Demo05ArrayDynamicUse {
    public static void main(String[] args) {
        String[] arrayA = new String[3];
        System.out.println(arrayA[1]);

        
        int[] arrayB = new int[3];
        System.out.println(arrayB[0]);

    }
}

