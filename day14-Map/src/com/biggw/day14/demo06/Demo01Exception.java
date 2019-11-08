package com.biggw.day14.demo06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 21:27
 */

/*
 * java.util.Throwable: 类是java语言中所有错误和异常的超类
 *
 *      Exception: 编译器异常,在写代码过程中出现的问题
 *          编译时候异常:FileNotFoundException,Io
 *      RuntimeException是Exception的子类
 *      RuntimeException: 运行期异常,java程序运行过程中出现的异常
 *          异常就是小毛病,我们可以采取两种方式解决异常
 *          1.抛出：我们交给上层处理
 *          2.捕获异常: (我们将异常捕获,并处理)
 *
 *      Error: 错误
 *          我们不能通过捕获错误和抛出错误,解决错误毛病
 *
 * */
public class Demo01Exception {
    public static void main(String[] args) {


        funcParaseException();
        funcArrayIndexOutOfBoundsException();


        // OutOfMemoryError 错误我们不能通过捕获和抛出解决,所以我们要避免错误
        try {
            int[] array = new int[1024*1024*1024];
        } catch (Exception e) {
//            System.out.println("e = " + e);
            System.out.println("==");
        }finally {
            System.out.println("我在这!");
        }

        // JVM终止当前执行的java程序,(中断处理,后面的程序不再执行)【最后没打印下面一句话,仔细分析,很重要】
        System.out.println("我在这这!");

    }

    private static void funcArrayIndexOutOfBoundsException() {
        int[] array = new int[5];
        try {
            array[6] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e = " + e);
//            e.printStackTrace();
        }
    }

    private static void funcParaseException() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse("2019-02");
        } catch (ParseException e) {
//            e.printStackTrace();
            System.out.println("e = " + e);
        }
    }
}

/*
e = java.text.ParseException: Unparseable date: "2019-02"
e = java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
我在这!
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at com.biggw.day14.demo06.Demo01Exception.main(Demo01Exception.java:36)

Process finished with exit code 1
* */
