package com.biggw.day07.demo02;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 22:30
 */

/*
 * 匿名对象：
 * new 类名称().成员变量
 * new 类名称().成员方法
 *
 * 注意:
 * 1.匿名对象只能使用唯一的一次,下次再使用必须得重新创建一个新对象
 *
 * 使用建议:
 * 1.如果我们确定我们得对象只使用唯一得一次,我们就可以使用匿名对象
 * */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("高圆圆");
        person1.showName();
        System.out.println("=============");

        // 匿名对象
        new Person().setName("哈利波特");
        new Person().showName();
        System.out.println("=============");

    }
}
