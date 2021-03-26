package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/02/22 7:56 PM
 */
public class Out {
    public static void main(String[] args) {
        Print p = new Print();
        new Thread(p, "线程1").start();
        new Thread(p, "线程2").start();
        new Thread(p, "线程3").start();
    }
}
