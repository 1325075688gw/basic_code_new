package com.biggw.day08.demo02;

/**
 * @author gw
 * @date 2019/10/30 0030 下午 21:39
 */

/*
 * 按照指定格式拼接字符串 [123#456#789]
 * */
public class Deno06StringPratice {
    public static void main(String[] args) {
        String str1 = "123,456,789";
        String[] strs = str1.split(",");
        String str2 = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                str2 = "[".concat(strs[0]);
            } else if (i < strs.length - 1) {
                str2 = str2.concat("#").concat(strs[i]);
            } else {
                str2 = str2.concat("#").concat(strs[i]).concat("]");
            }
        }
        System.out.println("str2 = " + str2);

        int[] array = new int[]{1, 2, 3};
        String string = fromArrayToString(array);
        System.out.println("string = " + string);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "world" + array[i] + "]";
            } else {
                str += "world" + array[i] + "#";
            }
        }
        return str;
    }
}
