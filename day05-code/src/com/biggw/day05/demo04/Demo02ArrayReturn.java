package com.biggw.day05.demo04;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 16:02
 */

/*
 * 一个方法可以有0，1，2，3...个输入参数,但是只能有0个或一个返回值,不能有2个或以上的返回值.
 *
 * 如果希望一个方法中返回多个数据,我们可以借助数组作为返回类型。
 * */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3};
        int[] res = cal(arrayA);
        System.out.println("sum: " + res[0]);
        System.out.println("avg: " + res[1]);
    }

    // 数组的输入和返回都是地址值
    public static int[] cal(int[] arrayA) {
        int sum = 0, avg;
        for (int i = 0; i < arrayA.length; i++) {
            sum += arrayA[i];
        }
        avg = sum / arrayA.length;

        int[] res = {sum, avg};
        return res;
    }
}
