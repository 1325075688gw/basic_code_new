package com.biggw.day11.demo06;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 21:45
 */
public class Hero {
    private String name;
    private Weapon weapon;
    private int age;

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public void attack() {
        System.out.println(this.age + "的：" + this.name + "正在用:" + this.weapon.getCode() + "攻击提莫");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
