package com.biggw.day13.demo01;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 20:57
 */
public class HashSetClassTest {
    public static void main(String[] args) {
        Person person1 = new Person("小妹", 23);
        Person person2 = new Person("小妹", 23);
        Person person3 = new Person("大妹", 23);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        System.out.println("person1 = " + person1.equals(person2));

        HashSet<Person> people = new HashSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person : people) {
            System.out.println("person = " + person);
        }

        System.out.println("people = " + people);
    }
}

class Person {
    private String name;
    private int age;


    // 一般情况下我们不需要重写hashCode()方法,只有当我们需要对自定义的类进行Set集合存储时候,我们推荐重写hashCode方法


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
