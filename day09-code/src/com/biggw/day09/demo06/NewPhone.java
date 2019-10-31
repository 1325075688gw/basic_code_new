package com.biggw.day09.demo06;

/**
 * @author gw
 * @date 2019/10/31 0031 下午 20:42
 */
public class NewPhone extends Phone {
    @Override
    public void show() {

        // 想要扩展新功能时候,我们尽量覆盖重写,然后添加新功能
        super.show();
        System.out.println("显示电话号码");
    }
}
