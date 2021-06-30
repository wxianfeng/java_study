package com.wxianfeng.open.optional;

import java.util.Optional;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/29 4:23 PM
 */
public class OptionalTest {
    public static void main(String[] args) {
        OptionalBean optionalBean = null;
        String name = Optional.ofNullable(optionalBean)
                .map(OptionalBean::getName)
                .orElse(null);

        System.out.println(name);
    }
}
