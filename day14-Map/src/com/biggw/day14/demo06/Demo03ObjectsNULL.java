package com.biggw.day14.demo06;

import java.util.Objects;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 22:40
 */


/*
 * Objects中的静态方法:
 * public static <T> T requireNonNull(T obj): 查看指定的引用对象是不是null
 * 源码:
 * public static <T> T requireNonNull(T obj) {
 *      if (obj == null) {
 *          throw new NullPointerException();
 *      } else {
 *          return obj;
 *      }
 *  }
 *
 * public static <T> T requireNonNull(T obj, String message) {
 *      if (obj == null) {
 *          throw new NullPointerException(message);
 *      } else {
 *          return obj;
 *      }
 *  }
 *
 *
 * */
public class Demo03ObjectsNULL {
    public static void main(String[] args) {
        func(null);
        func2(null);
        func3(null);
    }

    private static void func3(Object obj) {
        Objects.requireNonNull("空指针异常3");
    }

    private static void func2(Object obj) {
        Objects.requireNonNull(obj);
    }

    private static void func(Object obj) {
        if (obj == null) {
            throw new NullPointerException("空指针异常");
        }
    }
}
