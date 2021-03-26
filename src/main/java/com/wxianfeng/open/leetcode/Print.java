package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/02/22 7:55 PM
 */
class Print implements Runnable {
    private int num = 1;
    private Object obj = new Object();
    @Override
    public void run() {
        while(true) {
            synchronized (obj) {
                obj.notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + " : " + num);
                    num++;
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

