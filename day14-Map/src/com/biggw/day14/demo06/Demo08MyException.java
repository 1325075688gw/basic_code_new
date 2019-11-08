package com.biggw.day14.demo06;

import java.util.Scanner;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 16:03
 */

/*
 * 自定义异常:
 *      java提供的异常类,不能满足我们使用,我们需要自定义一些异常类
 *
 * 格式:
 *      public class MYException  extends Exception | RuntimeException{
 *          添加一个空参数构造方法();
 *          添加一个带异常信息构造方法();
 * }
 *
 * 注意:
 *      1.自定义异常类一般以Exception结尾
 *      2.自定义异常类,必须继承Exception或者RuntimeException
 *          继承Exception:那么自定义的异常就是一个编译器异常,如果方法内部抛出了编译器异常,就不许throws, 或者try...catch
 *          继承RuntimeException,那么自定义的异常就是一个运行期异常,1.不用处理,最后被JVM捕获,交给JVM处理,2.try...catch,3.throws
 *
 * */
public class Demo08MyException {
    public static void main(String[] args) throws MyException {
        String[] strings = new String[]{"小白","小绿","小东"};
        System.out.print("请输入: ");
        String name = new Scanner(System.in).next();
        check(strings, name);


    }

    private static void check(String[] strings, String name) throws MyException {
        for (String string : strings) {
            if(string.equals(name)){
                throw new MyException("用户名已被注册");
            }
        }
        System.out.println("注册成功");
    }
}

class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}


