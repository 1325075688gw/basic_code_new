package com.biggw.day08.demo02;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 19:57
 */
public class Zi extends Fu{
    public String zi = "子类独有变量";
    public String name = "共有变量：子";

    public void method(){
        System.out.println("name = " + name);
    }
}
