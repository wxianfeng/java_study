package com.wxianfeng.open.abstractTest;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/25 2:36 PM
 */
public class AbstractTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("abc");
        dog.setAge(12);

        new AnimalClient().eat(dog);
    }
}
