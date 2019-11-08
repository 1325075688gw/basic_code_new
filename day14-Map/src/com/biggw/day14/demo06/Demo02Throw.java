package com.biggw.day14.demo06;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 22:22
 */

/*
 * throw关键字:
 * 作用:
 *      可以使用throw关键字在指定的方法中抛出指定的异常
 * 使用格式:
 *      throw new XXXExceptioin("异常产生的原因")
 *
 * 注意:
 *      1.throw关键字必须写在方法里面
 *      2.throw关键字后面new出来的对象必须是Exception或者Exception的子类对象
 *      3.throw关键字抛出的异常,我们要进行处理
 *          throw关键字后边创建的RuntimeException或者RunException异常的子类对象,我们可以不用去处理,默认最后会交给JVM处理(先打印异常对象,然后中断程序)
 *          throw关键字后边创建的编译异常,(写代码时候报错),我们就必须处理这个异常,要么throw,要么try...catch
 *
 * */
public class Demo02Throw {
    public static void main(String[] args){
        int[] array = new int[5];
        int index = 6;
        func(array, index);
    }

    private static void func(int[] array,int index){
        if(index<0 || index>array.length){
            throw new IndexOutOfBoundsException("索引异常");
        }
        if(array == null){
            throw new NullPointerException("空指针异常");
        }
    }
}
