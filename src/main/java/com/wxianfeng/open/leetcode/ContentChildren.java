package com.wxianfeng.open.leetcode;

import java.util.Arrays;

/**
 * @author haomiao.wxf
 * @date 2021/02/22 4:37 PM
 *
 * https://leetcode-cn.com/problems/assign-cookies/solution/tan-xin-suan-fa-ying-gai-jiao-pian-xin-s-iw8m/
 */
public class ContentChildren {

    public static void main(String[] args) {
        int[] g = new int[]{1,2,3,4,5};
        int[] s = new int[]{1,2,3};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        // 先对胃口值和饼干尺寸进行排序
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int j = 0; count < g.length && j < s.length; j++) {
            // 如果当前饼干能满足当前孩子的胃口值，count就加1，否则就继续查找更大的饼干
            if (g[count] <= s[j]) {
                count++;
            }
        }

        return count;
    }

}
