package com.biggw.day12.demo03;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 23:30
 */

/*
 * 定义泛型接口2
 * 含有泛型的接口的第二种是实现方式:接口使用什么泛型,实现类也使用相同的泛型,（类跟着接口走）
 *
 * 就相当于定义了一个含有泛型的类,创建对象的时候确定泛型的类型
 *
 *
 * 源码示例
 *
 * public interface List<E>{
 *      boolean add(a);
 *      E get(int index);
 * }
 *
 * public class ArrayList<E> implments List<E>{
 *
 *      public boolean add(E e);
 *      public E get(int index);
 * }
 *
 * */

public class Demo07EInterface2 {
    public static void main(String[] args) {
        EInterface22<String> stringEInterface22 = new EInterface22<>();
        stringEInterface22.methodAbstract2();
    }
}

class EInterface22<E> implements EInterface2<E> {
    @Override
    public <E> void methodAbstract2() {
        System.out.println("泛型接口2");
    }
}

interface EInterface2<E> {
    public <E> void methodAbstract2();
}