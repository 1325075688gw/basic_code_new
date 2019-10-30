package com.biggw.day07.demo04;

import java.util.Arrays;

/**
 * @author gw
 * @date 2019/10/30 0030 上午 11:12
 */
public class Demo01ArrayPerson {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        array[0] = new Person("齐天大圣", 15);
        array[1] = new Person("猪八戒", 18);
        array[2] = new Person("沙僧", 23);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());
        }
    }
}
