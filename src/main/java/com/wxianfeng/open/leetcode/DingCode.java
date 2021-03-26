package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/02/21 7:20 PM
 *
 * 有 m 个人(m=100)，每个人一个号码牌(1-100) ，围成一个圆，从第一个人开始数，每数到 7 淘汰该人，
 * 下一个人继续从 1 开始计数并到 7 淘汰，以此类推，请编码计算并输出最后那个号牌
 */
public class DingCode {
    public static void main(String[] args) {
        // 1
        System.out.println(lastNumber(1));
        // 2
        System.out.println(lastNumber(2));
        // 3
        System.out.println(lastNumber(3));
        // 4
        System.out.println(lastNumber(8));
        // 50
        System.out.println(lastNumber(100));
    }

    /**
     *
     * @param m 人数 (号码牌)
     *
     * @return 最后剩下的号牌号码
     *
     * 递推法
     *
     * 举例:
     * 假设 10 个人，编号为 0 ~ 9
     *
     * 第 7 个人编号 6 淘汰后，每个人编号减去 7，重新编号为 0,1,2,3...8
     *
     * 变成了 9 个人的问题，那么 10 个人的解就是 9 个人的解 + 7
     *
     * 9 个人的解怎么得到，计算 8 个人的解 + 7
     *
     * 以此类推，于是就是一个 O(n) 的递推法
     */
    public static int lastNumber(int m) {
        // 剩下的编号
        int number = 0;
        // 循环递推
        for(int i = 1; i <= m; i++) {
            number = (number + 7) % i;
        }

        // 还原编号
        return number + 1;
    }

}
