package com.biggw.day11.demo07;

import com.biggw.day11.demo06.Weapon;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 22:08
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        // 匿名内部类和匿名对象的使用
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu~");
            }
        });

        hero.attack();
    }
}
