package com.biggw.day08.demo03;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 18:28
 */

/*
 * 静态代码块：
 *
 * 静态代码加载优先于非静态代码,所以静态代码块优先于构造方法先执行
 *
 * public class Person {
 *      static {
 *          // 静态代码块内容
 *      }
 * }
 *
 * 静态代码块的典型用途:
 * 用来一次性初始化静态成员（JDBC时候常用）
 * */
public class StaticKuai {

    private int id;
    private String name;
    private static int numCounter;
    private static int num;

    static {
        System.out.println("静态代码块");
        num = 1;
        numCounter = 2;
    }

    public StaticKuai() {
    }

    public StaticKuai(int id, String name) {
        System.out.println("第" + StaticKuai.num + "次构造函数");
        ++StaticKuai.num;
        this.id = ++StaticKuai.numCounter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumCounter() {
        return numCounter;
    }

    public static void setNumCounter(int numCounter) {
        StaticKuai.numCounter = numCounter;
    }
}
