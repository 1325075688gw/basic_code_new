package com.biggw.day09.demo12;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 22:17
 */
public class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void showMoney() {
        System.out.println("我是: " + this.name + ", 我有: " + this.money + "钱");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
