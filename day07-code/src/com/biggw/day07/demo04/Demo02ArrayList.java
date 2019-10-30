package com.biggw.day07.demo04;

import java.util.ArrayList;

/**
 * @author gw
 * @date 2019/10/30 0030 上午 11:23
 */

/*
 * 数组的长度必须一开始久确定,程序运行期间不可改变, 所以我们需要寻找新的替代品 ArrayList<E>
 * ArrayList<E>:程序运行期间长度可变,E代表泛型,表示ArrayList里面的数据的类型
 *
 * 注意：
 * ArrayList中的类型必须统一
 * E(泛型)必须是引用类型,不能是8种基本类型
 * 直接打印ArrayList,如果里面内容为空,则输出【】,因为原作者对toString进行了重写
 *
 * */
public class Demo02ArrayList {
    public static void main(String[] args) {
        // JDK 1.7版本之前这么写
        // ArrayList<String> arrayList = new ArrayList<String>();

        // JDK 1.7及之后版本这么写
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("arrayList = " + arrayList);

        // 向ArrayList添加元素
        arrayList.add("齐天大圣");
        System.out.println("arrayList = " + arrayList);
        arrayList.add("美猴王");
        arrayList.add("六耳猕猴");
        System.out.println("arrayList = " + arrayList);
    }

}
