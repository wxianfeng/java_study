package com.wxianfeng.open.generic;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/17 5:31 PM
 */
public class GenericMethod {
    public static <T> void out(T d) {
        System.out.println(d);
    }

    public static void main(String[] args) {
        out(123);
        out("abc");
        out(true);
    }
}
