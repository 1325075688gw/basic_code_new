package com.biggw.day06.demo01;

import java.util.Arrays;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 16:14
 */
public class Demo1PrintArray {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        System.out.print("[");
        for (int i = 0; i < arrayA.length; i++) {
            if (i == arrayA.length - 1) {
                System.out.print(arrayA[i] + "]");
            } else {
                System.out.print(arrayA[i] + ",");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arrayA));
    }
}
