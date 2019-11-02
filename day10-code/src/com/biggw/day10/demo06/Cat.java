package com.biggw.day10.demo06;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 15:32
 */
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼!");
    }
    
    public void sleep(){
        System.out.println("猫睡觉!");
    }
}
