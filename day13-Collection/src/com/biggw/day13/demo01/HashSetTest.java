package com.biggw.day13.demo01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 19:04
 */

/*
 * java.util.Set接口 extends Collection接口
 * Set接口的特点:
 * 1.不允许存储重复的元素
 * 2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 *
 * java.util.HashSet集合 implements Set接口
 * HashSet特点:
 * 1.不允许存储重复的元素
 * 2.没有索引,没有带索引的方法,也不允许使用普通的for循环遍历
 * 3.是一个无序集合,存储元素和取出元素的顺序有可能不一致
 * 4.底层是一个哈希表结构(存储速度非常快)【重要】
 *
 *
 * JDK 1.8 之前,哈希表 = 数组+链表
 * JDK 1.8及之后,哈希表 = 数组+链表(红黑树)（提高查询速度）【当链表长度超过8位,将链表改为红黑树】
 * */
public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // 使用迭代器遍历set集合
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("next = " + next);
        }

        // 使用增强for循环遍历set集合
        for (Integer integer : set) {
            System.out.println("integer = " + integer);
        }

        System.out.println("================");

        HashSet<String> strings = new HashSet<>();
        strings.add("重地");
        strings.add("通话");
        for (String s : strings) {
            System.out.println("s = " + s);
        }
    }
}
