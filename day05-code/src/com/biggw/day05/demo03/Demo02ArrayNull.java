package com.biggw.day05.demo03;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 15:01
 */


/*
* NullPointerException:数组空指针异常
*
* 注意：任何引用类型都可以赋值为null
* */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] arrayA = null;
        System.out.println(arrayA[0]);
    }
}
