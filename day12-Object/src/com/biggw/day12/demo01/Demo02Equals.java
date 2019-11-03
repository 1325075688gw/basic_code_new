package com.biggw.day12.demo01;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 13:28
 */


/*
 * public boolean equals(Object obj); Object类中的equals,比较两个对象的地址是否向通
 *
 * 源码:
 * Object:可以接收任何类型的参数
 * public boolean equals(Object obj){
 *      // 这里面我们可以发现 == ：
 *      基本数据类型:比较的是两个数据的值
 *      引用数据类型:比较的是两个引用数据类型对象的地址
 *      我们这儿是自己创建的类,然后生成的对象,所以属于引用数据类型,所以
 *      return (this == obj);
 * }
 *
 * */
public class Demo02Equals {
    public static void main(String[] args) {
        Person person = new Person("张三", 23);
        Person person1 = new Person("张三", 23);

        boolean equal = person.equals(person1);
        System.out.println("equal = " + equal);

        // 防止空指针异常
        System.out.println("================");
        String string = null;
        equal = person.equals(string);
        System.out.println("equal = " + equal);

        // 防止向下转型失败
        System.out.println("================");
        String string1 = "fdaf";
        equal = person.equals(string1);
        System.out.println("equal = " + equal);

        /*
        equal = true
        ================
        equal = false
        ================
        equal = false
        */
    }
}
