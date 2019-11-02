package com.biggw.day10.demo07;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 16:44
 */
public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("打开鼠标！");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标!");
    }

    public void click() {
        System.out.println("点击鼠标!");
    }
}
