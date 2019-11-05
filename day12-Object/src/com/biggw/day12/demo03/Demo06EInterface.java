package com.biggw.day12.demo03;

import java.util.Scanner;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 22:50
 */


/*
 * 定义含有泛型的接口
 *
 *
 * 1.定义含有泛型的接口,实现接口的时候,指定接口的泛型
 * public interface Animal<E>{}
 * public class Cat implements Animal<String>{}
 *
 *
 * 源码中的例子：
 * public interface Iterator<E>{
 *      E.next();
 * }
 * Scanner类实现了Iterator接口,并指定接口的泛型为String,所以重写的next方法默认是String
 * public final class Scanner implements Iterator<String>{
 *      public String next(){
 *
 *      }
 * }
 *
 *
 * */


public class Demo06EInterface{
    public static void main(String[] args) {
        DEInterface11 deInterface11 = new DEInterface11();
        deInterface11.methodAbstract();
    }
}

class DEInterface11 implements EInterface1<String>{
    @Override
    public <String> void methodAbstract() {
        System.out.println("泛型接口1");
    }
}

interface EInterface1<E>{
    public <E> void methodAbstract();
}