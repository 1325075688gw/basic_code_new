package com.biggw.day10.demo07;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 16:43
 */
public class KeyBorad implements Usb {
    @Override
    public void open() {
        System.out.println("打开键盘!");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘!");
    }

    public void type() {
        System.out.println("键盘输入文字!");
    }
}
