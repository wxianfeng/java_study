package com.wxianfeng.open.abstractTest;

/**
 *
 * https://blog.csdn.net/qq_28483283/article/details/50839456
 *
 * @author wang.fl1429@gmail.com
 * @date 2021/06/25 2:34 PM
 */
public abstract class Animal {
    private String name;
    private Integer age;

    public Animal() {
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    abstract void eat();
}
