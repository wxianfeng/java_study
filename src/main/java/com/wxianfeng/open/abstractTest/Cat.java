package com.wxianfeng.open.abstractTest;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/25 2:36 PM
 */
public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat:" + this.getName() + "" + this.getAge() + "eat");
    }
}
