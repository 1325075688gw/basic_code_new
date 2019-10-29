package com.biggw.day06.demo02;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 17:03
 */
public class Phone {
    String brand;
    int price;
    String color;

    public void call(String who){
        System.out.println("打电话给： " + who);
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }
}
