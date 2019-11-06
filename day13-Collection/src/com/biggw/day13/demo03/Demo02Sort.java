package com.biggw.day13.demo03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 22:15
 */

/*
 * public static<T> void sort(List<T> list); 将集合中的数据按照默认规则进行排序
 *
 * 注意:
 *      sort使用前提:被排序的集合里面存储的元素,必须实现Comparable(接口),重写接口中的方法compareTo,定义排序规则
 *
 *      升序: this - 参数
 *            return 0;就是按照原来顺序输出
 *
 *
 * */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Person> objects = new ArrayList<>();
        objects.add(new Person("小明", 23));
        objects.add(new Person("小红", 24));
        objects.add(new Person("小绿", 22));

        System.out.println("objects = " + objects);
        Collections.sort(objects);
        System.out.println("objects = " + objects);
    }
}


class Person implements Comparable<Person> {
    private String name;
    private int age;

    @Override
    public int compareTo(Person person) {
//        return 0;
        return this.getAge() - person.getAge();

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
