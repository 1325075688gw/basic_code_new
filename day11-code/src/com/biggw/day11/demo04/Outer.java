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
 *
 * 局部内部类注意:
 * 1. 如果希望访问局部内部类所在方法的局部变量,那么这个局部变量必须是【有效的final】
 *    有效的final:1.直接加final关键字
 *               2.不加final关键字,但是不能对该变量进行改变
 *
 * 原因：
 * 1.凡是new出来的对象都是在堆内存当中,堆内存的东西不会因为方法的结束而回收,而是整个程序运行完毕后,进行回收
 * 2.方法中的局部变量,是放到栈里面,当该方法运行完毕后,局部变量释放.
 * 3.如果局部内部类new出来的对象用到了局部变量,当方法消失后,如果是局部变量,则在消失前将局部变量拷贝到堆里面对应内存去。
 * 4.若是非final,则频繁变化,不知道拷贝什么到堆里面去.所以我们要求局部变量为final。
 *
 *
 * */
public class Outer {
    public void methodOuter() {
        int num = 10;
        class Inner {
            public void methodInner() {
                System.out.println("num = " + num);
            }
        }

        // Inner 只属于methodOuter,所以只能在这里面才能使用

        Inner inner = new Inner();
        inner.methodInner();
    }
}
