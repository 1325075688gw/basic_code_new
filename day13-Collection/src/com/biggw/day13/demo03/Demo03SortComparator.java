package com.biggw.day13.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 22:40
 */


/*
 * Comparator
 * Comparable都是接口
 *
 * public static <T> void sort(List<T> list, Comparator<? super T> c)
 *
 * Comparable: 我们的类继承Comparable接口,然后实现里面的CompareTo方法,
 *             如何调用:Collections.sort(arrayList)
 *
 * Comparator: 我们的类不用继承Comparable接口,也不用继承Comparator接口
 *             如何调用:Collections.sort(objects, new Comparator<Person1>() {  // 匿名类
                        @Override
                        public int compare(Person1 person1, Person1 t1) {
                            int res = person1.getAge() - t1.getAge();
                            // 前面减去后面,升序排列
                            if (res == 0) {
                                return person1.getName().charAt(0) - t1.getName().charAt(0);
                            }
                            return res;
                        }
                    });
 *
 * */
public class Demo03SortComparator {
    public static void main(String[] args) {
        ArrayList<Person1> objects = new ArrayList<>();
        objects.add(new Person1("b小明", 23));
        objects.add(new Person1("小红", 24));
        objects.add(new Person1("小绿", 22));
        objects.add(new Person1("a小绿", 23));

        System.out.println("objects = " + objects);
        Collections.sort(objects, new Comparator<Person1>() {
            @Override
            public int compare(Person1 person1, Person1 t1) {
//                return 0;
                int res = person1.getAge() - t1.getAge();

                // 前面减去后面,升序排列
                if (res == 0) {
                    return person1.getName().charAt(0) - t1.getName().charAt(0);
                }
                return res;
            }
        });
        System.out.println("objects = " + objects);
    }
}


class Person1 {
    private String name;
    private int age;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person1() {
    }

    public Person1(String name, int age) {
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
