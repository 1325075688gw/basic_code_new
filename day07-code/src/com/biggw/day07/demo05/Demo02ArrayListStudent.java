package com.biggw.day07.demo05;

import java.util.ArrayList;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 13:32
 */

/*
 * 自定义3个学生对象,添加到集合,并遍历
 * */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {

        // 以前的做法：对象数组长度不可变
        Student[] students1 = new Student[3];

        // 现在的做法：集合保存,长度可变
        ArrayList<Student> students = new ArrayList<>();
        // 匿名对象
        students.add(new Student("齐天大圣", 23));
        students.add(new Student("孙悟空", 24));
        students.add(new Student("美猴王", 25));

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("name: " + student.getName());
        }

        System.out.println("============");
        for (Student stu : students) {
            System.out.println("age = " + stu.getAge());
        }
    }
}
