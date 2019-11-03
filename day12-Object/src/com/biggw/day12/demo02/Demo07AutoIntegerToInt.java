package com.biggw.day12.demo02;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 19:58
 */
public class Demo07AutoIntegerToInt {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        // 自动装箱 Integer integer = new Integer(1)
        Integer integer = 1;
        // 自动拆箱: intger.intValue()
        // 自动装箱 Integer.valueOf(integer.intValue()+1)
        integer = 1 + integer;
        System.out.println("integer = " + integer);
    }
}
