package com.wxianfeng.open.interface_test;

/**
 * @author haomiao.wxf
 * @date 2021/02/26 4:11 PM
 */
public class Car implements IGo {
    @Override
    public String go() {
        System.out.println("am car");
        return null;
    }
}
