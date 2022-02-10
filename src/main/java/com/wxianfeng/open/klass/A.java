package com.wxianfeng.open.klass;

import com.wxianfeng.open.base.Man;

/**
 * Created by haomiao on 2020/03/14 7:46 PM
 */
public class A {
    private String name;

    public A() {
    }

    public A(boolean b) {
        System.out.println("aaaa");
    }

    public static void main(String[] args) {
        A a = new A(); // java 构造函数参数必须对应
        A a1 = new A(){}; // java 构造函数参数必须对应

        Person person = new Person();
        // 同一个包内，protected 可以访问到
        person.age = 25;
        System.out.println(person.age);

        Man man = new Man();
        // 不是同一个包内
        // man.age = 30;
    }
}


