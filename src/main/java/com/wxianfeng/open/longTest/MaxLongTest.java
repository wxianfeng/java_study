package com.wxianfeng.open.longTest;

/**
 * @author haomiao.wxf
 * @date 2021/04/28 3:35 PM
 */
public class MaxLongTest {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);

        String a = "a_b";

        // 不能用 -1
        // System.out.printf(a.split("_")[-1]);
        System.out.printf(a.split("_")[a.split("_").length - 1]);
    }
}
