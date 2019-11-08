package com.biggw.day14.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 13:24
 */

/*
 * Map集合中的第一种遍历方式:通过键找值进行遍历
 *
 * Map集合中的方法:
 *      public Set<K> keySet(); 返回此映射中的键的set视图
 *
 * 实现步骤:
 *      1.使用Map集合中的方法KeySet(),把Map集合中所有的key取出来,存储到一个Set集合中
 *      2.使用Set集合的迭代器方法,获取Map集合中每一个key
 *      3.通过Map集合中的方法get(key)
 *
 *
 * */
public class Demo02KeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Object v1 = hashMap.put("小明", 23);
        Object v2 = hashMap.put("小花", 24);

        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("hashMap.get(next) = " + hashMap.get(next));
        }

        for (String string : keySet) {
            System.out.println("hashMap.get(string) = " + hashMap.get(string));
        }

        for (String string : hashMap.keySet()) {
            System.out.println("hashMap.get(string) = " + hashMap.get(string));
        }
    }
}
