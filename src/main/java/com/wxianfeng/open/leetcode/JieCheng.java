package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/01/26 1:59 PM
 *
 * 阶乘
 */
public class JieCheng {
    public static void main(String[] args) {
        System.out.println(jieCheng(5));
    }

    public static int jieCheng(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            System.out.println("here");
            return n * jieCheng(n - 1);
        }
    }
}
