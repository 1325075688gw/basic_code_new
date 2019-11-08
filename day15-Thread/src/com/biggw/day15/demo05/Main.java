package com.biggw.day15.demo05;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 17:55
 */
public class Main {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new BaoZiPu(baoZi).start();
        new ChiHuo(baoZi).start();
    }
}
