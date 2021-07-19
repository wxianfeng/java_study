package com.wxianfeng.open.base;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/07/01 6:45 PM
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> keys = new HashSet<>();
        keys.add("a");
        keys.add("b");

        keys.add("a");

        System.out.println(keys);

        System.out.println(Math.abs(String.valueOf(7174717).hashCode()) % 32);

        System.out.println(Math.abs(String.valueOf(262226102).hashCode()) % 32);
    }
}
