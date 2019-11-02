package com.biggw.day11.demo04;

/**
 * @author gw
 * @date 2019/11/2 0002 下午 19:56
 */

/*
 * 局部内部类
 *
 * 修饰符 class 外部类名称{
 *      修饰符 返回值类型 外部类方法名称(参数列表){
 *          方法体;
 *          class 局部内部类名称{
 *              ....
 *          }
 *      }
 * }
 *
 *
 * 权限修饰符
 * 1. 外部类: public, （default）
 * 2. 成员内部类: public, protected, (default), private
 * 3. 局部内部类: 什么都不写(但这儿并不等同于default的含义)
 * */
public class Outer {
    public void methodOuter() {
        class Inner {
            int num = 10;

            public void methodInner() {
                System.out.println("num = " + num);
            }
        }

        // Inner 只属于methodOuter,所以只能在这里面才能使用

        Inner inner = new Inner();
        inner.methodInner();
    }
}
