package com.wxianfeng.open.klass;

/**
 * Created by haomiao on 2020/03/14 7:46 PM
 */
public class A {

    public A() {
    }

    public A(boolean b) {
        System.out.println("aaaa");
    }

    public static void main(String[] args) {
        A a = new A(); // java 构造函数参数必须对应
        A a1 = new A(){}; // java 构造函数参数必须对应
    }
}


