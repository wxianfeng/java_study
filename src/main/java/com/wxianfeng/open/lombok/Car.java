package com.wxianfeng.open.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author haomiao.wxf
 * @date 2021/04/21 9:27 PM
 */
@Setter
@Getter
@Accessors(chain = true)
public class Car {
    private String name;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
