package com.biggw.day07.demo04;

import java.util.ArrayList;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 13:08
 */

/*
* 集合中存储的都是地址值,而基本数据类型 byte,short,int,long,float,double,char,boolean,基本类型直接存储在栈区,也就没有地址值,所以
* 不能存储在集合中,所以集合中存储的引用类型。
*
* 那么我们需要怎么保存int到集合中去呢,我们可以使用基本类型的包装类Integer
*
* 基本类型      包装类（引用类型,包装类都位于java.lang包下,所以不需要导包）
* byte          Byte
* short         Short
* int           Integer 【特殊】
* long          Long
* float         Float
* double        Double
* char          Character   【特殊】
* boolean       Boolean
*
* 从JDK 1.5+开始,支持自动装箱和自动拆箱
*
* 自动装箱:基本类型-->包装类型
* 自动拆箱:包装类型-->基本类型
* */
public class Demo05ArrayBasic {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        // 自动装箱
        array.add(110);
        array.add(120);
        array.add(130);

        // 自动拆箱
        int num = array.get(2);
        Integer num2 = array.get(2);
        System.out.println("num2 = " + num2);
        System.out.println("num = " + num);
    }
}
