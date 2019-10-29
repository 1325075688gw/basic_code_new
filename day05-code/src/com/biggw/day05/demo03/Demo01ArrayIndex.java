package com.biggw.day05.demo03;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 14:51
 */

/*
* ArrayIndexOutOfBoundsException：数组索引越界异常
* */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 2, 3};

        // 数组越界异常
       System.out.println(arrayA[3]);
    }
}
