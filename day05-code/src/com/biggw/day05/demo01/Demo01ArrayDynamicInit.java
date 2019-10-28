package com.biggw.day05.demo01;

/**
 * @author gw
 * @date 2019/10/28 0028 下午 19:18
 */

/*
* 需求：我们需要给多名同学存放多科成绩
*
* 数组：（数组内容可以是基本类型，也可以是引用类型）
* 1.数组是一种引用数据类型
* 2.数组中的多个数据，类型必须统一
* 3.数组的长度在程序运行期间不允许改变
*
* 数组初始化：
* 1.动态初始化（指定长度）
* 2.静态初始化（指定内容）
*
* 1.动态初始化：
* 数据类型【】 数组名称 = new 数据类型【数组长度】
* int[] arrayA = new int[10]
*
* 位置参数，含义解析：
* 数据类型：数组中元素的类型
* 【】：代表是数组，和普通定义变量区别开
* new：创建数组的动作
* 数据类型：和左边的数据类型一致
* 数组长度：数组的总容量
* */
public class Demo01ArrayDynamicInit {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        double[] arrayB = new double[10];

        // 创建长度为10的字符数组
        String[] arrayC = new String[10];
    }
}
