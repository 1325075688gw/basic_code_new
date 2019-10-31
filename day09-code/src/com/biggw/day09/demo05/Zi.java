package com.biggw.day09.demo05;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 20:23
 */

/*
 * 方法的覆盖重写：
 *
 * 1.子类和父类名称相同,参数列表也相同
 * 2.@Override可以加可以不加,但是尽量加上,这样编译器可以帮我们检查是不是重写
 * 3.子类方法的返回值必须【小于等于】父类方法的返回值  比如 Object String
 * 4.子类方法的权限必须【大于等于】父类方法的权限修饰符 比如public pretected default private
 * */
public class Zi extends Fu {
    @Override
    public void method() {

    }
}
