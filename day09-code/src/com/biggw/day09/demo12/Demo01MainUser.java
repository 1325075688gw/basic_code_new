package com.biggw.day09.demo12;

import java.util.ArrayList;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 22:49
 */
public class Demo01MainUser {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        // 这儿不能是 User member1
        Member member1 = new Member("小马", 0);
        Member member2 = new Member("小东", 0);
        Member member3 = new Member("小西", 0);
        System.out.println("member3.here = " + member3.here);

        // (方法)编译看左,运行看右
        // (变量)编译看左,运行看左
        User user1 = new Member("小西", 0);
        System.out.println("user1.here = " + user1.here);
        user1.showMoney();

        manager.showMoney();
        member1.showMoney();
        member2.showMoney();
        member3.showMoney();

        ArrayList<Integer> arrayList = manager.sendMoney(100, 3);
        // 报错 (方法)编译看左,运行看右
        // user1.receive(arrayList);
        manager.sendMoney(100, 3);
        member1.receive(arrayList);
        member2.receive(arrayList);
        member3.receive(arrayList);

        manager.showMoney();
        member1.showMoney();
        member2.showMoney();
        member3.showMoney();
    }
}
