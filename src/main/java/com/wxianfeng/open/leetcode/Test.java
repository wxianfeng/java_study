package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/01/26 2:32 AM
 */
public class Test {
    public static void main(String[] args) {
        int a = 0b1001;
        //a >>>= 1;
        //System.out.println(a);
        //System.out.println(Integer.toBinaryString(a));

         System.out.println(hammingWeight(a));
    }

    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
