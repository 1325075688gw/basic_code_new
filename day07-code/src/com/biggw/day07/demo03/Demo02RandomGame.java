package com.biggw.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * @author gw
 * @date 2019/10/30 0030 上午 10:41
 */
public class Demo02RandomGame {
    public static void main(String[] args) {
        System.out.print("请输入你猜的数：");
        int tmp;

        // 产生随机数字只用一次,所以可以用匿名对象来完成
        int num = new Random().nextInt(101);
        Scanner scanner = new Scanner(System.in);
        tmp = scanner.nextInt();
        while (true) {
            if (tmp > num) {
                System.out.print("猜大了,请重新输入：");
                tmp = scanner.nextInt();
            } else if (tmp < num) {
                System.out.print("猜小了,请重新输入：");
                tmp = scanner.nextInt();
            } else {
                System.out.println("恭喜你,猜对了！");
                break;
            }
        }
    }
}
