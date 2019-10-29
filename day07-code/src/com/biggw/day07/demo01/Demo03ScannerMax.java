package com.biggw.day07.demo01;

import java.util.Scanner;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 22:14
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int max;
        max = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("max = " + max);
    }
}
