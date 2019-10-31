package com.biggw.day09.demo12;

import java.util.ArrayList;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 22:18
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendMoney(int totalMoney, int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int leftMoney = this.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足!");
            return arrayList;
        }
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count; i++) {
            arrayList.add(avg);
        }
        arrayList.set(arrayList.size() - 1, avg + mod);
        this.setMoney(leftMoney - totalMoney);
        return arrayList;
    }
}
