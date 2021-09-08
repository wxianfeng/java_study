package com.wxianfeng.open.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/08/04 5:32 PM
 */
public class AtomicLongTest {
    private static Long count = 0L;
    private static final AtomicLong atomicLong = new AtomicLong();

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    count++;
                    atomicLong.getAndIncrement();
                }
            }).start();
        }

        // 993572
        System.out.println(count);
        // 1000000
        System.out.println(atomicLong);
    }
}
