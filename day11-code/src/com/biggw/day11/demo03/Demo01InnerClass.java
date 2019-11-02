package com.biggw.day11.demo03;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 18:52
 */
public class Demo01InnerClass {
    public static void main(String[] args) {

        // 通过外部类new的对象,调用外部类的方法,然后间接调用内部类的方法
        Body body = new Body();
        body.methodBody();
        System.out.println("====================");
        // 直接new出内部类的对象,进行调用
        Body.Heart heart = new Body().new Heart();
        heart.beat();
        System.out.println("====================");
        heart.methodHeart();

        /*
        外部类
        内部类,心脏跳动!
        ====================
        内部类,心脏跳动!
        ====================
        这是外部类
        这是外部类
        */
    }
}
