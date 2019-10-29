package com.biggw.day06.demo04;

/**
 * @author gw
 * @date 2019/10/29 0029 下午 20:40
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println(this.name + " 你好 " + name);
        System.out.println(this);
    }

    // 当方法的局部变量和类的成员变量重名时候,根据就近原则,优先使用局部变量,因此,我们如果想要
    // 调用成员变量,我们需要使用this
    public void sayHello2(String name) {
        //region Description
        System.out.println(name + " 你好 " + name);
        //endregion
    }
}
