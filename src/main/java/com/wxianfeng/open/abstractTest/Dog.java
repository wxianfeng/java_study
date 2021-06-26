package com.wxianfeng.open.abstractTest;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/25 2:35 PM
 */
public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog:" + this.getName() + "" + this.getAge() + "eat");
    }
}
