package com.biggw.day10.demo07;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 16:52
 */
public class Main {
    public static void main(String[] args) {
        Usb usb = new KeyBorad();
        Usb usb1 = new Mouse();

        Computer computer = new Computer();
        computer.open();
        computer.useDevice(usb);
        computer.useDevice(usb1);
        computer.close();

        /*点击鼠标!
        打开电脑!
        打开键盘!
        键盘输入文字!
        关闭键盘!
        打开鼠标！
        关闭鼠标!
        关闭电脑!*/
    }
}
