package com.biggw.day14.demo06;

import java.io.File;
import java.io.IOException;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 15:01
 */


/*
 * 子父类异常：
 *      如果父类抛出了多个异常,子类重写父类方法时候,抛出和父类相同的异常或者是父类的子类异常或者不抛出异常
 *      如果父类没有跑出异常,子类重写父类方法的时候也不能抛出异常,此时子类产生异常后,只能通过捕获处理(try...catch),不能抛出处理
 *
 * */
public class Demo07FuZiException {
    public static void main(String[] args) {
        Fu zi = new Zi();
        try {
            zi.func();
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}

class Fu {
    public void func() throws IOException {
        new File("a.txt");
        System.out.println("Fu");
    }
}

class Zi extends Fu {
    @Override
    public void func() throws IOException {
        new File("b.txt");
        System.out.println("Zi");
    }
}
