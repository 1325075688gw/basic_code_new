package com.biggw.day12.demo03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 15:41
 */

/*
 * 泛型通配符 ？
 * 泛型通配符用来作为接收参数
 * 当我们不知道用什么类型来接收的时候,我们用泛型通配符接受
 *
 * 泛型是没有继承概念的
 *
 * 不能用于创建对象使用
 * ArrayList<?> arrayList = new ArrayList<>();
 * */
public class Demo08ERestricted {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);

        func(arrayList);
        func(arrayList1);
        System.out.println("============");
        func1(arrayList);
        func1(arrayList1);

    }

    private static void func(ArrayList arrayList) {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println("object = " + object);
        }
    }

    // 泛型是没有继承概念的,所以不能用ArrayList<Object> arrayList接受
    // 泛型是没有继承概念的,所以这也是错误的 Collection<Object> list = new ArrayList<String>();
    public static void func1(ArrayList<?> arrayList) {
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
