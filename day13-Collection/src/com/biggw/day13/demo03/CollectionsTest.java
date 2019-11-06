package com.biggw.day13.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 21:46
 */


/*
 * java.util.Collections是集合工具类,用来对集合进行操作,常用方法如下
 *
 * 1.public static <T> boolean addAll(Collection<T> c, T...elements); 往集合中添加一些元素
 * 2.public static void shuffle(List<?> list); 将集合中的数据打乱
 * 3.public static void shuffle(List<?> list, Random r); 将集合中的数据按照随机种子进行打乱, Random r = new Random(123),123是一个随机数
 * 4.public static <T> void sort(List<T> list); 将集合中的数据按照默认规则进行排序
 * 5.public static <T> void sort(List<T> list, Comparator<? super T>); 将集合中的数据按照指定规则进行排 序
 *
 *
 *
 * */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // 多态
        Collection<String> collection = new ArrayList<>();

/*        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        以前是这种添加元素的方式,操作非常麻烦,所以推荐添加多个元素用Collections.addAll
        */

        Collections.addAll(arrayList, "a", "b", "c");
        System.out.println("arrayList = " + arrayList);
        System.out.println("=====================");
        Collections.shuffle(arrayList);
        System.out.println("arrayList = " + arrayList);

    }
}
