package com.biggw.day07.demo01;

import java.util.Scanner;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 21:36
 */


/*
 * 除了8种基本数据类型其它都是引用类型,引用类型使用,有三步骤
 *
 * 引用类型使用的三步骤:
 * 1.导包
 * import 包路径.类名称
 * 如果需要使用的目标类,和当前使用类位于同一包路径下,则可以省略导包语句不写
 * 只有Java.lang包下的类不需要导包,其它的包需要我们写import语句 （String位于Java.lang包下,但是我们不用导包）
 *
 * 2.创建
 * 类名称 对象名 = new 类名称();
 *
 * 3.使用
 * 对象名.成员方法名();
 *
 * */
public class Demo01Scanner {
    public static void main(String[] args) {
        // Scanner有一个默认参数,System.in,代表的含义是从键盘输入
        Scanner scanner = new Scanner(System.in);
        // 我们从键盘输入的东西都是字符串,只不过nextInt把字符串转化为了数字,如果出现不能转化为数字的字符,那么就会抛出异常InputMismatchException

        // 获取键盘输入的数字,用nextInt();
        int num = scanner.nextInt();
        System.out.println("num = " + num);

        // 获取键盘输入的字符串,用next()
        String string = scanner.next();
        System.out.println("string = " + string);
    }
}
