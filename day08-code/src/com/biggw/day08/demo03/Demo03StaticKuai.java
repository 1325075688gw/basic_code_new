package com.biggw.day08.demo03;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 18:34
 */
public class Demo03StaticKuai {
    public static void main(String[] args) {
        StaticKuai s1 = new StaticKuai(12, "小红");
        StaticKuai s2 = new StaticKuai(14, "小明");

        System.out.println("s1 = " + s1.getId());
        System.out.println("s2 = " + s2.getId());
    }
}

// 可以看出静态代码块只调用第一次

/*
静态代码块
第1次构造函数
第2次构造函数
s1 = 3
s2 = 4
*/
