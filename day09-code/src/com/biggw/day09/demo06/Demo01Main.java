package com.biggw.day09.demo06;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 20:43
 */
public class Demo01Main {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.show();

        // 父类引用指向子类对象
        Phone phone = new NewPhone();
        phone.show();
    }
}
