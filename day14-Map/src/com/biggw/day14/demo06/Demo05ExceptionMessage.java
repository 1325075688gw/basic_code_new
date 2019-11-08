package com.biggw.day14.demo06;

import java.io.FileNotFoundException;

/**
 * @author gw
 * @date 2019/11/7 0007 上午 10:16
 */


/*
 * 打印异常的三种常用方式
 * e.getMessage()  : 打印信息最简短,只打印异常的提示信息
 * e.toString()    : 打印信息一般,包括异常类型和异常的提示信息
 * e 等价于e.toString  : 等价于e.toString()
 * e.printStackTrace() : 打印信息最全面
 * */
public class Demo05ExceptionMessage {
    public static void main(String[] args) {
        func("a1.txt");
    }

    private static void func(String s) {
        if(!"a.txt".equals(s)){
            try {
                throw new FileNotFoundException("文件名错误!");
            } catch (FileNotFoundException e) {
//                System.out.println("e.getMessage() = " + e.getMessage());
//                System.out.println("e.toString() = " + e.toString());
//                System.out.println("e = " + e);
                e.printStackTrace();
            }
        }
    }
}
