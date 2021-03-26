package com.wxianfeng.open.async;

import java.util.concurrent.CompletableFuture;

/**
 * Created by haomiao on 2020/05/28 2:21 PM
 */
public class AsyncCompletableFuture {
    public static void main(String[] args) {
        System.out.println("am main thread start");

        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("hi");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("am com.wxianfeng.open.async thread");
        });

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("am main thread end");
    }
}
