package com.biggw.day10.demo07;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 16:46
 */
public class Computer {
    public void open() {
        System.out.println("打开电脑!");
    }

    public void close() {
        System.out.println("关闭电脑!");
    }

    public void useDevice(Usb usb) {
        if (usb instanceof KeyBorad) {
            KeyBorad keyBorad = (KeyBorad) usb;
            keyBorad.open();
            keyBorad.type();
            keyBorad.close();
        } else if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.open();
            mouse.click();
            mouse.close();
        }
    }
}
