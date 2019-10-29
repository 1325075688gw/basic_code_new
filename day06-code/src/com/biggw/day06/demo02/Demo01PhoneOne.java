package com.biggw.day06.demo02;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 19:00
 */
public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("phone = " + phone);
        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.brand = "苹果";
        phone.color = "red";
        phone.price = 110;

        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.call("奥巴马");
        phone.sendMessage();
    }
}
