package com.biggw.day04.demo01;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 15:52
 */
public class Demo01 {
    public static void main(String[] args) {
        printMethod();
        // 打印调用
        System.out.println(sum(3, 5));
        // 单独调用
        sum(3, 5);
        // 赋值调用
        int res;
        res = sum(3, 5);
    }

/*
Java中不允许嵌套定义方法
现阶段，我们方法的修饰符默认为public static
方法之间的参数用逗号分隔

方法的三种调用格式
1.打印调用  System.out.println(function（）);
2.单独调用  function();
3.赋值调用  int a = functions();
*/

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            // 输出换行
            System.out.println();
        }
    }

    public static int sum(int a, int b) {
        // redundant: 多余的，不需要的
        int res = a + b;
        return res;
    }
}
