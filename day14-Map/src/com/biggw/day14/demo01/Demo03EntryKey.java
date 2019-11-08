package com.biggw.day14.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 13:53
 */

/*
* Map遍历集合的第二种方法：使用Entry对象遍历
*
* Map集合中的方法:
*       Set<Map.Entry<K,V>> entrySet(); 返回此映射中包含的映射关系的Set视图
*
* 实现步骤：
*       1.使用Map集合中的方法enteySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
*           Entry对象:就是键值对组合（类似夫妻组合,黄晓明和baby）
*       2.遍历Set集合,获取每一个Entry对象
*       3.使用Entry对象中的方法getKey()和getValue()获取键和值
*
* */
public class Demo03EntryKey {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Object v1 = hashMap.put("小明", 23);
        Object v2 = hashMap.put("小花", 24);

        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println("next.getKey()+next.getValue() = " + next.getKey() + next.getValue());
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            System.out.println("next.getKey()+next.getValue() = " + stringIntegerEntry.getKey() + stringIntegerEntry.getValue());
        }

    }
}
