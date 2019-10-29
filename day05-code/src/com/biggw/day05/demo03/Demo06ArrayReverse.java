package com.biggw.day05.demo03;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 15:43
 */
public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("array[" + i + "]: " + arrayA[i]);
        }

        for (int min = 0, max = arrayA.length-1; min < max; min++, max--) {
            int tmp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = tmp;
        }

        System.out.println("=========================");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("array[" + i + "]: " + arrayA[i]);
        }
    }
}
