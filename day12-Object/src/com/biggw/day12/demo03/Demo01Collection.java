package com.biggw.day12.demo03;

import java.util.ArrayList;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 20:40
 */


/*
 * 集合中常用的方法
 *
 * public Object[] toArray()(); 变成数组,
 *
 *
 * */
public class Demo01Collection {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(24);
        arrayList.add(23);

        Object[] a = arrayList.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + a[i]);
        }

        System.out.println("===========");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList = " + arrayList.get(i));
        }

    }
}
