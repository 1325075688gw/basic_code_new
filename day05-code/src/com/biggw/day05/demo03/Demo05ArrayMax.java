package com.biggw.day05.demo03;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 15:32
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (max < arrayA[i]) {
                max = arrayA[i];
            }
        }
        System.out.println("max = " + max);
    }
}
