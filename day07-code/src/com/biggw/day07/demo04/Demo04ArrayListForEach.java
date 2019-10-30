package com.biggw.day07.demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 13:03
 */
public class Demo04ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("齐天大圣");
        arrayList.add("美猴王");
        arrayList.add("六耳猕猴");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("==============");
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
