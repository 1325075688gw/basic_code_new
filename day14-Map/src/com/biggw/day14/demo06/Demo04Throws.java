package com.biggw.day14.demo06;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 23:03
 */

/*
 * throws关键字: 抛出异常
 * 作用:
 *      如果我们方法内部抛出了编译时异常:FileNotFoundException,IOException是FileNotFoundException的父类
 *      【重要,只有当我们声明了new 编译时异常时候,我们才需要throws或者try...catch】
 * */
public class Demo04Throws {
    public static void main(String[] args) {
        try {
            func("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("e = " + e);
        }
    }

    private static void func(String s) throws FileNotFoundException {
        if(!s.equals("b.txt")){
            throw new FileNotFoundException("文件名错误");
        }
    }
}
