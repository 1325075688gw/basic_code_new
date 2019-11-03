package com.biggw.day12.demo02;

import java.util.Arrays;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 18:55
 */
public class Demo04System {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        int[] raw = {1, 2, 3, 4, 5};
        int[] old = {6, 7, 8, 9, 10};

        System.arraycopy(raw, 0, old, 0, 3);
        System.out.println("old = " + old);
        System.out.println("Arrays.toString(old) = " + Arrays.toString(old));
    }
}
