package com.biggw.day06.demo05;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 21:25
 */
public class Demo01Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(20);
        student1.setName("张飞");
        System.out.println("student1.age: " + student1.getAge());
        System.out.println("student1.name: " + student1.getName());

        Student student2 = new Student("赵云", 26);
        System.out.println("student2.age: " + student2.getAge());
        System.out.println("student2.name: " + student2.getName());

    }
}
