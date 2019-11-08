package com.biggw.day15.demo05;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 17:36
 */
public class BaoZiPu extends Thread {
    BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi){
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while(true){
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    try {
                        // 有包子,去唤醒吃货吃包子
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    baoZi.baoZiPi = "冰皮";
                    baoZi.baoZiXian = "肉馅";
                }else {
                    baoZi.baoZiPi = "薄皮";
                    baoZi.baoZiXian = "菜馅";
                }
                count++;
                System.out.println("包子铺正在生产: "+baoZi.baoZiPi+baoZi.baoZiXian+"包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = true;
                System.out.println("包子铺已经准备好了: "+baoZi.baoZiPi+baoZi.baoZiXian+"包子,吃货可以吃了");
                baoZi.notify();
            }
        }
    }
}
