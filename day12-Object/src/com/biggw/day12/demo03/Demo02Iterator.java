package com.biggw.day12.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 20:54
 */

/*
 * java.util.Iterator是一个接口,迭代器（对集合进行遍历）
 *
 * 两个常用方法,
 * 1.public boolean hasNext(); 判断是否还有元素可以迭代,如果有,返回true
 * 2.public E next(); 返回迭代的下一个元素
 *
 * Iterator是一个迭代器,我们不能直接创建对象,我们借助Collection接口里面有一个方法,
 *  public Iterator<E> iterator();返回在collection上的迭代器
 *
 *
 * 迭代器使用步骤：
 * 1.使用collection中的Iterator方法创建迭代器实现类对象,使用Iterator<E>接口接收(多态)
 * 2.使用Iterator接口中的方法,hasNext判断有没有下一个元素
 * 3.使用Iterator接口中的方法,Next输出下一个元素
 *
 * */
public class Demo02Iterator {
    public static void main(String[] args) {
        func();

    }

    private static void func() {
        Collection<String> collection = new ArrayList<>();
        collection.add("张三丰");
        collection.add("柏芝若");

        // 第一种遍历方法 
        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println("objects = " + objects[i]);
        }

        // 第二种遍历方法
        Iterator<String> iterator = collection.iterator();
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());

        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        // 第三种遍历方法
        for (Iterator<String> it2 =  collection.iterator(); it2.hasNext(); ) {
            System.out.println("iterator1.next() = " + it2.next());
        }


    }
}
