package com.wxianfeng.open.klass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haomiao.wxf
 * @date 2021/02/21 6:06 PM
 *
 *  有m个人(m=100)，每个人一个号码牌(1-100) ，围成一个圆，从第一个人开始数，每数到7淘汰该人，
 *  下一个人继续从1开始计数并到7淘汰，以此类推，请编码计算并输出最后那个号牌
 */
public class DingCode {
    public static void main(String[] args) {
        // 1
        System.out.println(lastNumber(1, 7));
        // 2
        System.out.println(lastNumber(2, 7));
        // 3
        System.out.println(lastNumber(3, 7));
        // 4
        System.out.println(lastNumber(8, 7));
        // 50
        System.out.println(lastNumber(100, 7));
    }

    /**
     *
     * @param m 人数 (号码牌)
     * @param n 淘汰的数字
     *
     * @return 最后剩下的号牌号码
     */
    public static int lastNumber(int m, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            for (int j = 1; j <= n; j++) {
                if (j != n) {
                    list.add(list.get(0));
                }
                list.remove(0);
            }
        }

        return list.get(0);
    }
}
