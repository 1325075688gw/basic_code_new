package com.biggw.day09.demo12;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 22:46
 */
public class Member extends User {
    public String here ="Member";
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    @Override
    public void showMoney() {
        super.showMoney();
        System.out.println("这是Member");
    }

    public void receive(ArrayList<Integer> arrayList) {
        int index = new Random().nextInt(arrayList.size());
        int money = arrayList.remove(index);
        this.setMoney(this.getMoney() + money);
    }
}
