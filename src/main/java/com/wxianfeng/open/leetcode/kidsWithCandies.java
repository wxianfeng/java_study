package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/02/20 5:29 PM
 *
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candidates = new int[]{2, 3, 5, 1, 3};
        int extraCandines = 3;
        candies(candidates, extraCandines);
    }

    public static void candies(int[] candines, int extraCandies) {
        for (int i = 0; i < candines.length; i++) {
            CandiesThread candiesThread = new CandiesThread(candines, candines[i], i, extraCandies);
            candiesThread.start();
        }
    }
}
