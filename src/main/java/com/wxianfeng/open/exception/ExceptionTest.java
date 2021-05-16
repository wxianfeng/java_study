package com.wxianfeng.open.exception;

/**
 * @author haomiao.wxf
 * @date 2021/04/21 5:11 PM
 */
public class ExceptionTest {
    public void test() {
        throw new RuntimeException("xx");
    }

    public void test1() {
        // throw new Exception("bb");
    }

    public static void main(String[] args) {
        new ExceptionTest().test();
    }
}
