package com.biggw.day11.demo01;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 17:14
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("高圆圆");
        System.out.println("person.getName() = " + person.getName());
        person = new Person("哈利波特","f");
        System.out.println("person.getName() = " + person.getName());

        final Person person1 = new Person("白展堂","fd");
        System.out.println("person1.getName() = " + person1.getName());

        final int a;
        a=3;

        // 对于基本数据类型的变量,加上final后,则数据内容不能变
        // 对于引用类型,加上final后,引用数据的地址不能变
        // person1 = new Person("小怪兽"); 错误

    }
}
