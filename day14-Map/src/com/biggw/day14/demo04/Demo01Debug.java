package com.biggw.day14.demo04;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 16:47
 */

/*
 * Debug调试程序
 *      可以让代码逐行运行,查看运行过程中的变量
 *
 * 使用方式:
 *      1.在行号的左边,鼠标左键单击,添加断点,再点击一次,取消该断点
 *      2.右键,选择Debug模式执行程序
 *
 * 主要按键
 *         shift + f9: 进入Debug模式
 *      1. f8: 逐行执行程序
 *      2. f7: 进入到方法中
 *      3. shift+f8: 跳出方法
 *      4. f9: 跳到下一个断点,如果没有下一个断点,结束程序
 *      5. Ctrl+f12: 退出debug模式,停止程序
 *      6. Console: 切换到控制台
 *
 * */
public class Demo01Debug {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 100; i++) {
            a = i;
        }
        func();
    }

    private static void func() {
        System.out.println("true = " + true);
        System.out.println("true = " + true);
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }
}
