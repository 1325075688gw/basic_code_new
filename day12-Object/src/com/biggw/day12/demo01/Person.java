package com.biggw.day12.demo01;

import java.util.Objects;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 13:30
 */
public class Person {
    private String name;
    private int age;

    // 重写equals方法
    //<editor-fold desc="自己覆盖重写equals">
/*    @Override
    public boolean equals(Object obj){
        // 增加一个判断,如果传递的就是this,那么直接返回true,提高程序效率
        if(obj ==this){
            return true;
        }

        // 增加一个判断,防止传入的obj为null,提高程序效率
        if (obj == null){
            return false;
        }
        // 增加一个判断,防止向下转型异常 ClassCastException
        if (obj instanceof Person){
            Person obj1 = (Person) obj;
            boolean equal = (this.name.equals(obj1.name) && this.age == obj1.age);
            return equal;
        }
        return false;
    }*/
    //</editor-fold>


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() 使用反射技术,判断o是不是Person类型
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public Person(String name, int age) {
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
