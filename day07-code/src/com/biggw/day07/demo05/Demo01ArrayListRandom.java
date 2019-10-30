package com.biggw.day07.demo05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 13:23
 */

/*
* 题目：
* 生成6个1~33之间的随机整数,添加到集合,并遍历集合
* */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        // 匿名对象
        methodRandom(new Scanner(System.in));
    }

    public static void methodRandom(Scanner scanner){
        System.out.print("请输入随机数个数：");
        int size = scanner.nextInt();
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(34));
        }
        for (Integer num : array) {
            System.out.println("num = " + num);
        }
    }
}
