package com.biggw.day06.demo04;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 20:42
 */
public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小花");
        person.sayHello("小明");
        person.sayHello2("小明");

        // person地址值和this相同,所以可以确定成员方法,默认传递了一个this参数
        System.out.println("person = " + person);
    }
}
