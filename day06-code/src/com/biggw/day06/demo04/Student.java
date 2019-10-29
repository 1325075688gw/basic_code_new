package com.biggw.day06.demo04;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 20:52
 */


/*
 * 构造方法:public ClassName(){};
 *
 * 注意事项：
 * 1.构造方法名和类名相同
 * 2.构造方法没有返回值类型,连void都不需要
 * 3.构造方法不需要return
 * 4.如果没有编写构造方法,编译器会默认赠送一个无参构造方法,同时里面什么都不做：即赠送 public ClassName(){};
 * 5.一旦编译器写了至少一个构造方法,那么编译器将不再赠送无参构造方法
 * */
public class Student {
    private String name;
    private int age;

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

    public Student() {
        System.out.println("无参构造函数");
    }

    // Java里面构造方法可以重载
    public Student(String name, int age) {
        System.out.println("有参构造函数");
        this.name = name;
        this.age = age;
    }
}
