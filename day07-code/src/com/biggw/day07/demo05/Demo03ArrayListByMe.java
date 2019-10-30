package com.biggw.day07.demo05;

import java.util.ArrayList;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 14:39
 */

/*
* 指定格式打印
*
* */
public class Demo03ArrayListByMe {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("齐天大圣", 23));
        students.add(new Student("孙悟空", 24));
        students.add(new Student("美猴王", 25));
        students.add(new Student("六耳猕猴", 25));

        printByMe(students);
    }

    public static void printByMe(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (i == 0) {
                System.out.print("{");
                System.out.print(student.getName());
            } else if (i < students.size() - 1) {
                System.out.print("@" + student.getName());
            } else {
                System.out.print("@" + student.getName() + "}");
            }
        }
    }
}
