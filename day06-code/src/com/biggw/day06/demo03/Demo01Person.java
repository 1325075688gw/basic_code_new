package com.biggw.day06.demo03;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 20:28
 */

import com.biggw.day06.demo03.Person;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("person.age = " + person.getAge());
        System.out.println("person.name = " + person.getName());

        person.setAge(20);
        person.setName("刘德华");
        System.out.println("person.age = " + person.getAge());
        System.out.println("person.name = " + person.getName());
    }
}
