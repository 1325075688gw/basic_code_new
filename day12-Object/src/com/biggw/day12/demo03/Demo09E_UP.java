package com.biggw.day12.demo03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 16:04
 */

/*
 * 泛型的上限限定: ? extends E   代表使用的泛型只能是E类型的子类或者本身
 * 泛型的下限限定：？ super E    代表使用的泛型只能是E类型的父类或者本身
 * */
public class Demo09E_UP {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        getElement1(list1);
//        getElement1(list2); // 报错
        getElement1(list3);
//        getElement1(list4); // 报错

//        getElement2(list1); // 报错
//        getElement2(list2); // 报错
        getElement2(list3);
        getElement2(list4);
    }

    /*
     * 类与类之间的继承关系
     * Integer extends Number extends Object
     * String extends Object
     * */

    public static void getElement1(Collection<? extends Number> coll) {
        System.out.println("coll = " + coll);
    }

    public static void getElement2(Collection<? super Number> coll) {
        System.out.println("coll = " + coll);
    }
}
