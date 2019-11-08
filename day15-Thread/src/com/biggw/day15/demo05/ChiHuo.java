package com.biggw.day15.demo05;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 17:45
 */
public class ChiHuo extends Thread{
    BaoZi baoZi;
    public ChiHuo(BaoZi baoZi){
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while(true){
            synchronized (baoZi){
                if(baoZi.flag == false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃:"+baoZi.baoZiPi+baoZi.baoZiXian+"的包子");
                baoZi.flag = false;
                System.out.println("吃货已经把:"+baoZi.baoZiPi+baoZi.baoZiXian+"的包子吃完了,包子铺开始生产包子");
                System.out.println("=======================");
                baoZi.notify();
            }
        }
    }
}
