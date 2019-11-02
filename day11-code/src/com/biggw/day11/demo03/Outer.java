package com.biggw.day11.demo03;

import java.security.PublicKey;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 19:44
 */
public class Outer {
    String name = "外部类成员变量";
    public static String name2 = "外部类类变量";

    public class Inter {
        String name = "内部类成员变量";

        public void interMethod() {
            String name = "内部类局部变量";
            System.out.println("内部类局部变量: " + name);
            System.out.println("内部类成员变量: " + this.name);

            // 访问外部类成员变量: 外部类名.this.外部类成员变量名
            System.out.println("外部类成员变量: " + Outer.this.name);
            System.out.println("外部类类变量: " + Outer.this.name2);
            System.out.println("外部类类变量: " + Outer.name2);

        }
    }
}
