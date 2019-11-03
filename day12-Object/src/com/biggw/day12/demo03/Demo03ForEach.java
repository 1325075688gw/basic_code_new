package com.biggw.day12.demo03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 21:50
 */
public class Demo03ForEach {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        Collection<String> collection = new ArrayList<>();
        collection.add("张三丰");
        collection.add("柏芝若");

        for (String string : collection) {
            System.out.println("string = " + string);
        }
    }
}
