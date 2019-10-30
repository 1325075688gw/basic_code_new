package com.biggw.day07.demo05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 14:55
 */
public class Demo04ArrayReturnEven {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = methodEven();
        System.out.println();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + ",");
        }
    }

    public static ArrayList<Integer> methodEven() {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100);
            integers.add(num);
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + ",");
        }
        return even;
    }
}
