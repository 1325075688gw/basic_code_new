package com.biggw.day14.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 15:13
 */
public class Demo04HashMapPerson {
    public static void main(String[] args) {
        HashMap<Person, String> personStringHashMap = new HashMap<>();
        personStringHashMap.put(new Person("小明", 23), "北京");
        personStringHashMap.put(new Person("小红", 24), "南京");
        personStringHashMap.put(new Person("小红", 24), "深圳");

        Set<Map.Entry<Person, String>> entries = personStringHashMap.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println("entry.getKey()+entry.getVlue = " + entry.getKey() + entry.getValue());
        }
    }
}

class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
