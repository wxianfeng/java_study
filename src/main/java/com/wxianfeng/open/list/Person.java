package com.wxianfeng.open.list;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/12 10:30 PM
 */
@Setter
@Getter
@Accessors(chain = true)
public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
