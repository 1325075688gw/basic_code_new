package com.biggw.day06.demo04;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 20:54
 */
public class Demo02Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(25);
        student1.setName("刘德华");
        System.out.println(student1.getAge());
        System.out.println(student1.getName());

        System.out.println("=========================");

        Student student2 = new Student("小明", 23);
        System.out.println(student2.getAge());
        System.out.println(student2.getName());
    }
}
