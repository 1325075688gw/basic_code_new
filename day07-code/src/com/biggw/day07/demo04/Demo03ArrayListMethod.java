package com.biggw.day07.demo04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 12:45
 */

/*
 * ArrayList<E>的常用方法：
 * 1.public boolean add(E e) 添加一个元素,添加成功返回true,对于ArrayList,添加一定会成功,但是其它集合不一定会成功.
 * 2.public E remove(int index) 删除一个元素,返回删除的元素
 * 3.public E get(int index) 查询索引位置元素
 * 4.public int size() 返回ArrayList集合的长度
 * */

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("arrayList = " + arrayList);
        System.out.println("arrayList.size = " + arrayList.size());
        boolean success = arrayList.add("齐天大圣");
        System.out.println("success = " + success);
        arrayList.add("孙悟空");
        arrayList.add("美猴王");
        int num = arrayList.size();
        System.out.println("num = " + num);
        String string = arrayList.remove(2);
        System.out.println("删除的元素是： " + string);
        String str = arrayList.get(1);
        System.out.println("str = " + str);
    }
}
