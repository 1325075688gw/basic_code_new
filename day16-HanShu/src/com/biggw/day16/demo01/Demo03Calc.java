package com.biggw.day16.demo01;

/**
 * @author gw
 * @date 2019/11/8 0008 下午 22:35
 */


/*
 * lambda表达式计算有参数,有返回值的练习
 *
 * 需求:
 *      给定一个计算机接口,内含calc方法,实现两个int数字相加,返回值
 *      使用lambda标准格式完成
 *
 * */
public class Demo03Calc {
    public static void main(String[] args) {
        invokeCalc(20, 30, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        invokeCalc(30,40, (int a,int b)->{
            return a+b;
        });

        // 省略
        invokeCalc(40,50,(a,b)->a+b);
    }

    public static void invokeCalc(int a, int b, Calculator calculator){
        int res = calculator.calc(a,b);
        System.out.println("res = " + res);
    }
}


// 抽象类里面只能含有抽象方法,和静态常量

// 要实现lambda表达式,这儿必须是interface
interface Calculator{
    public abstract int calc(int a,int b);


    // 如果要想使用lambda的省略模式,接口中就只能有一个抽象方法
//    public abstract int calc2();
}


