package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/01/23 1:21 AM
 *
 * https://leetcode-cn.com/problems/reverse-integer/
 */
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int xx = 0;
        if (x < 0) {
            xx = Math.abs(x);
        } else {
            xx = x;
        }

        String s = String.valueOf(xx);
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            stringBuffer.append(chars[s.length() - i - 1]);
        }
        String result = stringBuffer.toString();

        int r = 0;
        try {
            r = Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }

        if (x < 0) {
            r = -r;
        }

        if (r < Math.pow(-2, 31)) {
            return 0;
        }

        if (r > Math.pow(2, 31) - 1) {
            return 0;
        }

        return r;
    }
}
