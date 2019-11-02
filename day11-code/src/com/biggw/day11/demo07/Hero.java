package com.biggw.day11.demo07;

import com.biggw.day11.demo06.Weapon;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 22:00
 */
public class Hero {
    private Skill skill;
    private String name;

    public Hero() {
    }

    public Hero(Skill skill, String name) {
        this.skill = skill;
        this.name = name;
    }

    public void attack(){
        System.out.println(this.name + "正在:"  + "攻击提莫");
        skill.use();
        System.out.println("技能发送完毕");

    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
