package com.biggw.day13.demo01;

import java.util.LinkedHashSet;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 21:15
 */

/*
 * java.util.LinkedHashSet集合 extends HashSet集合
 *
 * 底层是一个哈希表+链表,多了一个链表记录存储顺序,保证元素有序
 *
 * */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("123");
        strings.add("123");
        strings.add("1234");
        System.out.println("strings = " + strings);
    }
}
