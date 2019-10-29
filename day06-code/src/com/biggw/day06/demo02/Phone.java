package com.biggw.day06.demo02;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 17:03
 */
public class Phone {
    String brand;
    int price;
    String color;

    public void call(String who) {
        System.out.println("打电话给： " + who);
    }

    public void sendMessage() {
        System.out.println("群发短信");

        /*
         * 局部变量:没有默认值,如果要想使用,必须先手动赋值,然后再使用
         * 成员变量、类变量:有默认值
         * */


        /*
         * 错误
         * int a;
         * System.out.println("a = " + a);
         */
    }

    public void watch(int a) {
        // 这儿不会因为a没有赋值而报错误,因为方法的执行需要调用,而调用就需要传递参数,所以我们一定会给形参赋值的,所以这儿不会报错。
        System.out.println("a = " + a);
    }
}
