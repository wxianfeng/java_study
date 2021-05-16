package com.wxianfeng.open.exceptionTest;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/12 10:58 AM
 */
public class MyException extends RuntimeException {

    public void test() {
        throw new RuntimeException("RE");
    }
}
