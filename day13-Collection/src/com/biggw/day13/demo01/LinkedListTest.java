package com.biggw.day13.demo01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author gw
 * @date 2019/11/4 0004 下午 16:03
 */

/*
 * java.util.LinkedList集合 implements List集合
 *
 * LinkedList集合的特点
 * 1.底层是一个链表结构:查询快,增删快
 * 2.里面包含了大量操作首尾元素的方法
 *
 * 注意：使用LinkedList集合特有的方法,不能使用多态
 *
 * public void addFirst(E e):将指定元素添加到列表的开头
 * public void addLast(E e):将指定元素添加到列表的末尾
 * public void push(E e):将指定元素添加到列表的开头
 *
 * public E getFirst()：返回此列表的第一个元素
 * public E getLast(): 返回此列表的最后一个元素
 *
 * public E removeFirst(): 移除并返回此列表的第一个元素
 * public E removeLast(): 移除并返回此列表的最后一个元素
 * public E pop(): 移除此列表的第一个元素
 *
 * */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> objects = new LinkedList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");

        ListIterator<String> objectListIterator = objects.listIterator();
        String next = objectListIterator.next();
        System.out.println("next = " + next);
        objectListIterator.add("44");
        System.out.println("next = " + objectListIterator.next());
        for (String object : objects) {
            System.out.println("object = " + object);
        }

        /*next = 1
        next = 2
        object = 1
        object = 44
        object = 2
        object = 3*/
    }
}
