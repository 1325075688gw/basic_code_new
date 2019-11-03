package com.biggw.day12.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 22:11
 */

/*
 * 泛型：
 * 创建集合时候,使用泛型
 * 好处：
 * 1.避免了类型转化的繁琐,存储什么类型,取出来就是什么类型
 * 2.把运行时候的异常提升到了编译时期（写代码时候就会报错）
 *
 * 弊端:
 * 1.指定了泛型,那么只能存储该类型的数据
 *
 *
 *  如果不指定泛型,默认Object类型,可以存储任意类型的数据
 *
 * */
public class Demo04E {
    public static void main(String[] args) {
        func();
        System.out.println(12 + "fsdaf");
    }

    private static void func() {
        Collection collection = new ArrayList<>();
        collection.add("张三丰");
        collection.add("柏芝若");
        collection.add(1);

        Iterator objects = collection.iterator();
        while (objects.hasNext()) {
            Object next = objects.next();
            // 弊端1,2 都在此.因为没有使用泛型,所以所以向下转型.同时抛出ClassCastException
            String string = (String) next;
            System.out.println("objects.next()+objects.length() = " + next + string.length());
        }

/*        objects.next()+objects.length() = 张三丰3
        objects.next()+objects.length() = 柏芝若3
        Exception in thread "main" java.lang.ClassCastException:*/
    }
}
