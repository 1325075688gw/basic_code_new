package com.biggw.day14.demo01;

import java.util.LinkedHashMap;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 15:23
 */


/*
 * java.util.LinkedHashMap<K,V> extends HashMap<K,V>
 * Map接口的哈希表和链表实现,具有可预知的迭代顺序
 *
 * 底层原理:
 *      哈希表+链表(记录元素顺序)
 *
 * */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("小明", 2);
        linkedHashMap.put(null, 2);
        linkedHashMap.put("小绿", 2);
        linkedHashMap.put("小绿", 3);

        System.out.println("linkedHashMap = " + linkedHashMap);

    }
}
