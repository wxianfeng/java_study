package com.wxianfeng.open.klass;

import lombok.ToString;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/07/05 10:34 AM
 */
@ToString
public class Person {
    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
