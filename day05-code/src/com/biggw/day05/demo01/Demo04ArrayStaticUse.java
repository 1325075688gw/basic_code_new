package com.biggw.day05.demo01;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 19:59
 */


/*
* 直接打印数组的名称，得到的是数组对应的，内存地址的Hash值 （16进制）
* 
* arrayA = [I@7530d0a
* [ :表示数组
* I：数组内容的类型为int
*
* */

public class Demo04ArrayStaticUse {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};
        System.out.println("arrayA = " + arrayA);
    }
}
