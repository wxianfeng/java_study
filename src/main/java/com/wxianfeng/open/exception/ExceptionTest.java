package com.wxianfeng.open.exception;

/**
 * @author haomiao.wxf
 * @date 2021/04/21 5:11 PM
 */
public class ExceptionTest {
    public void test() {
        throw new RuntimeException("xx");
    }

    public static void main(String[] args) {
        new ExceptionTest().test();
    }
}
