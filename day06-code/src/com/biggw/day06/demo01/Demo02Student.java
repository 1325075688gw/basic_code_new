package com.biggw.day06.demo01;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 16:58
 */


import com.biggw.day06.demo01.Student;

/*
 * 首先导包：也就是指出这个类的位置
 * import com.biggw.day06.demo01.Student
 * 对于和当前类属于一个包的情况，我们也可以省略导包语句，不写
 *
 * */
public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.name);
        System.out.println(student.age);

        student.name = "hello Java";
        student.age = 18;
        System.out.println(student.name);
        System.out.println(student.age);
    }
}
