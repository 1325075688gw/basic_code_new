package com.biggw.day12.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat是DateFormat的实现类

/**
 * @author gw
 * @date 2019/11/3 0003 下午 17:15
 */
public class Demo02DateFormat {
    public static void main(String[] args) throws Exception {
        func();
    }

    // throws 可以直接理解为声明异常
    public static void func() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日: HH时mm分ss秒");
        String string = simpleDateFormat.format(date);
        // 如果构造方法和字符串的解析顺序不一样,就会抛出异常
        Date date1 = simpleDateFormat.parse("2019年11月03日: 17时22分49秒");
        System.out.println("simpleDateFormat = " + string);
        System.out.println("date1 = " + date1);
    }
}
