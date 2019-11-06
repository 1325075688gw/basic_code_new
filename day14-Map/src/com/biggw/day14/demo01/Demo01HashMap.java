package com.biggw.day14.demo01;

import java.util.HashMap;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 23:38
 */

/*
 * HashMap 的底层实现是哈希表,所以查询速度特别快
 * 1.public boolean containsKey(Object key); 判断是否含有该键,返回boolean值
 * 2.public E get(Object key); 返回键对应的值,如果不存在,返回null
 * 3.public E put(K key, V value); 添加键值对,返回添加之前的值
 * 4.public V remove(Object key); 返回移除元素对应的值
 *
 * */
public class Demo01HashMap {
    public static void main(String[] args) {
        funcPut();
        System.out.println("========");
        funcRemove();
        System.out.println("========");
        funcGet();
        System.out.println("========");
        funcContainsKey();
    }

    private static void funcContainsKey() {
        // public boolean containsKey(Object key); 判断集合中是否包含指定的值
        // 包含返回true,不包含返回false


        System.out.println("ContainsKey");
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 用int类型接受,虽然我们的值是Integer类型,但是当我们第一次插入一对新键值对时候,由于键对应的值不存在,所以返回null
        Object v1 = hashMap.put("小明", 23);
        Object v2 = hashMap.put("小花", 24);
        boolean v3 = hashMap.containsKey("小绿");
        System.out.println("v3 = " + v3);
        boolean v4 = hashMap.containsKey("小花");
        System.out.println("v4 = " + v4);

    }

    private static void funcGet() {
        // public V get(Object key)
        // 如果key存在, 返回被删除的元素
        // 如果key不存在,返回null,所以推荐使用Object接收

        System.out.println("Get");
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 用int类型接受,虽然我们的值是Integer类型,但是当我们第一次插入一对新键值对时候,由于键对应的值不存在,所以返回null
        Object v1 = hashMap.put("小明", 23);
        Object v2 = hashMap.put("小花", 24);
        Integer v3 = hashMap.get("小绿");
        System.out.println("v3 = " + v3);
        // 获取对应键对应的值
        Integer v4 = hashMap.get("小花");
        System.out.println("v4 = " + v4);
    }

    public static void funcRemove() {

        // public V remove(Object key) 把指定的键对应的值从map集合中删除,返回被删除的元素
        // 如果key存在, 返回被删除的元素
        // 如果key不存在,返回null,所以推荐使用Object接收

        System.out.println("remove");
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 用Integer类型接受,虽然我们的值是int类型,但是当我们第一次插入一对新键值对时候,由于键对应的值不存在,所以返回null
        Object v1 = hashMap.put("小明", 23);
        Object v2 = hashMap.put("小花", 24);
        System.out.println("hashMap = " + hashMap);
        Integer v3 = hashMap.remove("小白");
        System.out.println("v3 = " + v3);
        Integer v4 = hashMap.remove("小花");
        System.out.println("v4 = " + v4);
    }

    public static void funcPut() {
        // public V remove(Object key);
        // 存储键值对的时候,key不重复,返回值为null
        // 存储键值对的时候,key重复,会使用新的value替换掉map中的重复的value,并且返回被替换的value

        System.out.println("Put");
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 用int类型接受,虽然我们的值是Integer类型,但是当我们第一次插入一对新键值对时候,由于键对应的值不存在,所以返回null
        Object v1 = hashMap.put("小明", 23);
        Object v2 = hashMap.put("小花", 24);
        // 我们还可以把put理解为修改键对应的值
        Object v3 = hashMap.put("小花", 25);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("hashMap = " + hashMap);

    }
}
/*Put
v1 = null
v2 = null
v3 = 24
hashMap = {小明=23, 小花=25}
========
remove
hashMap = {小明=23, 小花=24}
v3 = null
v4 = 24
========
Get
v3 = null
v4 = 24
========
ContainsKey
v3 = false
v4 = true*/
