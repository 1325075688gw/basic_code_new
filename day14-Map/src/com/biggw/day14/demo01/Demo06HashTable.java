package com.biggw.day14.demo01;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 15:32
 */

/*
 * java.util.HashTable<K,V> implments Map<K,V> 接口
 *
 * HashTable:底层也是一个hash表,是一个线程安全的集合,也就是说是单线程集合,速度慢
 * HashMap: 底层是一个哈希表,是一个线程不安全的集合,是多线程的集合,速度快
 *
 * HashMap集合(之前学习的所有集合)：可以储存null值,null键
 * HashTable集合:不能存储null值,null键
 *
 * HashTable和Vector一样,在JDK 1.2之前使用,1.2之后就被更加先进的集合(HashMap,ArrayList)替代了
 * HashTablede 子类Properties任然活跃在历史舞台
 * Properties集合是唯一一个和IO流相结合的集合
 *
 * */
public class Demo06HashTable {
    public static void main(String[] args) {

    }
}
