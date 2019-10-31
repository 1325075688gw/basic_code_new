package com.biggw.day08.demo03;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 22:29
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student(23, "小白");
        Student stu2 = new Student(20, "小黑");

        Student.setBanji("高三一班");
        System.out.println("stu1.name: " + stu1.getName() + ", stu1.age: " + stu1.getAge() + ", stu1.班级：" + Student.getBanji() + ", stu1.id: " + stu1.getId());
        System.out.println("stu2.name: " + stu2.getName() + ", stu2.age: " + stu2.getAge() + ", stu2.班级：" + Student.getBanji() + ", stu2.id: " + stu2.getId());

    }
}
