package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/01/26 1:24 PM
 */
public class ReverseBits {
    public static void main(String[] args) {
        int n = 0b1000110;
        System.out.println(reverseBits(n));
    }

    public static String reverseBits(int n) {
        int res = 0;
        for (int i=0; i< 7; ++i) {
            res = res << 1;
            res = n & 1 | res;

            n >>>= 1;

            System.out.println(res);
        }

        return Integer.toBinaryString(res);
    }
}
