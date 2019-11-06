package com.biggw.day11.demo12;

import com.sun.source.tree.NewArrayTree;
import javafx.beans.binding.DoubleExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 22:59
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> array =  randomList(10,20);
        System.out.println(array);
        List<Integer> array2  = randomList(20);
        System.out.println("array2 = " + array2);
        
        System.out.println("===============");
        ArrayList<Double> arrayList = redPackage(100,10);
        System.out.println("arrayList = " + arrayList);
        Object o = new Object();
        System.out.println("o = " + o);
        System.out.println("o.toString() = " + o.toString());
//        System.out.println(this.hashCode()); 错误
    }

    public static List<Integer> randomList(int n, int m){
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        int temp = m;
        for(int i = 0, j; i < n-1; i++){
            j = rand.nextInt(temp-1) + 1;
            temp -= j;
            list.add(j);
            if (temp == 1){
                break;
            }
        }
        list.add(temp);
        return list;
    }

    public static List<Integer> randomList(int n){
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int num = rand.nextInt(n);
            if (!list.contains(num)) {
                list.add(num);
                i++;
            }
        }
        return list;
    }

    public static ArrayList<Double> redPackage(int totalMoney, int count){
        ArrayList<Double> arrayList = new ArrayList<>();
        double totalMoneyFen = totalMoney*100;
        double left = totalMoneyFen - count;
        double[] rand = new double[count];
        double randSum = 0L;
        double[] res = new double[count];

        for (int i = 0; i < count; i++) {
            rand[i] = Math.random()*left;
            randSum += rand[i];
        }

        for (int i = 0; i < count; i++) {
            arrayList.add(Math.round((rand[i]/randSum*left+1)/100)*1.0);
        }
        return arrayList;
    }

}


