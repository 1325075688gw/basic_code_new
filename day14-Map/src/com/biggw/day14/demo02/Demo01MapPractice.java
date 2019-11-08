package com.biggw.day14.demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 15:41
 */

/*
 * 字符串遍历的两种方式:
 * 1.String类的方法toChayArray,把字符串转化为一个和字符数组,然后遍历数组
 * 2.String类的方法length()+charAt()
 *
 * */
public class Demo01MapPractice {
    public static void main(String[] args) {
        String string = "12321fasdfadfaffads";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            boolean b = hashMap.containsKey(aChar);
            if (!b) {
                hashMap.put(aChar, 1);
            } else {
                hashMap.put(aChar, hashMap.get(aChar) + 1);
            }
        }
        System.out.println("hashMap = " + hashMap);


        // 第一种遍历HashMap方法:keySet
        Set<Character> characters = hashMap.keySet();
        Iterator<Character> iterator = characters.iterator();
        while (iterator.hasNext()) {
            Character next = iterator.next();
            System.out.println("hashMap = " + next + hashMap.get(next));
        }

        // 第二种遍历HashMap方法:entrySet
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println("entry.getKey() = " + entry.getKey() + entry.getValue());
        }

    }
}
