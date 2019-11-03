package com.biggw.day12.demo02;

/**
 * @author gw
 * @date 2019/11/3 0003 下午 19:16
 */

/*
 * StringBulider 常用方法:
 *
 * public StringBuilder append(xx); 将任意类型的数据的字符串形式，添加到当前字符串末尾,并且返回添加后的当前字符串对象
 * public String toString(); 将stringBuilder转化为String
 * public StringBuilder(str);构造方法,将string转化为stringBulider
 * */
public class Demo05StringBuilder {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        // 默认16个字符长度
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(23423);
        StringBuilder stringBuilder1 = stringBuilder.append("发的");
        // 支持链式调用
        stringBuilder1.append(3).append(342);

        System.out.println("stringBuilder1 = " + stringBuilder1);
        System.out.println("stringBuilder = " + stringBuilder);

        boolean equal = stringBuilder.equals(stringBuilder1);
        boolean eqaul1 = stringBuilder == stringBuilder1;
        System.out.println("eqaul1 = " + eqaul1);
        System.out.println("equal = " + equal);

        System.out.println("======================");
        String string = stringBuilder.toString();
        System.out.println("string = " + string);

    }
}
