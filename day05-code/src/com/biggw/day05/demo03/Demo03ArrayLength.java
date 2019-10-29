package com.biggw.day05.demo03;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 15:10
 */


/*
 * 数组的长度是数组的一个属性
 * 获取数组的长度：array.length
 *
 * 数组一旦创建，程序运行期间，长度不可以改变。（数组是引用类型，所以栈中保存的是堆中地址，堆中才真正保存数组的对象）
 * */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        System.out.println("arrayA's length: " + arrayA.length);

        int[] arrayB = {1, 2, 3};
        System.out.println("arrayB's length: " + arrayB.length);
        arrayB = new int[]{1, 2, 3, 4, 5, 6};
        // 静态初始化的省略格式，不能拆分为两个步骤
        // arrayB = {1,2,3,4,5,6,7}; 错误

        System.out.println("arrayB's length: " + arrayB.length);
    }
}
