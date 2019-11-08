package com.biggw.day16.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 22:03
 */


/*
 * lambda表达式用来简写匿名内部类,也就是一个类想要继承抽象父类后，需要创建对象，可以用lambda来辅助完成
 * 也可以是一个实现类想要实现接口后，需要创建对象，可以用lambda来辅助完成
 * */
public class Demo02Person {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("小明", 23),
                new Person("小白", 25),
                new Person("小东", 22),
        };

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("小明", 23));

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                // 升序
                return person.getAge() - t1.getAge();
            }
        });
        System.out.println("people = " + people);
        for (Person person : people) {
            System.out.print(person);
        }


        System.out.println("====================");

        Arrays.sort(people, (Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        });
        // 省略
        Arrays.sort(people, (p1,p2)->p1.getAge()-p2.getAge());


        System.out.println("people = " + people);
        for (Person person : people) {
            System.out.print(person);
        }
    }
}


class Person {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}