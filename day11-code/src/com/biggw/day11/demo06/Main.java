package com.biggw.day11.demo06;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 21:48
 */
public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("无尽之刃");
        Hero hero = new Hero("盖伦", weapon, 24);
        hero.attack();
    }
}
