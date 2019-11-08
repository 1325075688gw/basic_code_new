package com.biggw.day14.demo03;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 16:22
 */


/*
 * JDK 9的新特性:
 *      1.List接口,Set接口,Map接口,每个接口里面都增加了一个静态方法of.可以一次性添加多个元素
 *      2.public static <E> List<E> of(E...element)
 *
 * 使用前提:
 *      当集合中的元素个数未确定时候
 *
 * 注意事项:
 *      1.of方法只适用于List接口,Set接口,Map接口,并不适用接口的实现类
 *      2.of方法返回的是一个不能改变的集合,用了of添加元素后的集合不能再使用add,put方法添加元素,会抛出异常
 *      3.Set接口和Map接口再调用of方法的时候,不能含有重复的元素,否则会抛出异常
 *
 * */
public class Demo01Java9 {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3");
        System.out.println("strings = " + strings);

        // 下面,两条语句都报错 UnsupportedOperationException
        // Collections.addAll(strings, "4", "5");
        // strings.add("7");
        System.out.println("============");

        Set<String> strings1 = Set.of("1", "2", "3");
        // IllegalArgumentException
        // Set<String> strings2 = Set.of("1", "2", "3","3");
        System.out.println("strings1 = " + strings1);
        System.out.println("=============");

        Map<String, Integer> integerMap = Map.of("1", 1, "2", 2);
        System.out.println("integerMap = " + integerMap);

    }
}
