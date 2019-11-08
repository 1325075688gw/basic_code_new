package com.biggw.day14.demo06;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author gw
 * @date 2019/11/7 0007 下午 12:49
 */

/*
 * finally:
 *      一般用于IO流资源释放
 *      无论是否出现异常,都会执行
 *
 * 子父类异常:子类异常写在上面,父类异常写在下面
 *
 * 运行期异常,可以不捕获(try...catch),也可以不抛出(throws),交给虚拟机处理
 * */
public class Demo06Finally {
    public static void main(String[] args) {
        int res = func();
        System.out.println("res = " + res);

        try {
            throw new FileNotFoundException("文件不存在");
        } catch (FileNotFoundException e) {
            System.out.println("==================");
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("无论是否出现异常,都会执行这段代码");
        }
        System.out.println("这段代码会执行");
    }

    private static int func() {

        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("没什么");
        } finally {
            System.out.println("没什么2");
            return 5;
        }
        // unreachable statement(不可达语句)/
        // return 6;


        //【46和49行的return只能存在一个】
    }
}

/*

==================
java.io.FileNotFoundException: 文件不存在
无论是否出现异常,都会执行这段代码
这段代码会执行
*/
