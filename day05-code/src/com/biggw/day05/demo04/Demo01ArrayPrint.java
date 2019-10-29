package com.biggw.day05.demo04;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 15:54
 */
public class Demo01ArrayPrint {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        printArray(arrayA);
    }


    // 形参传递进来的是数组的地址值
    public static void printArray(int[] arrayA) {
        System.out.println("arrayA = " + arrayA);
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("array[" + i + "]: " + arrayA[i]);
        }
    }
}
