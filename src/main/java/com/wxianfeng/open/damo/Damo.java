package com.wxianfeng.open.damo;

/**
 * @author haomiao.wxf
 * @date 2021/01/26 5:13 PM
 */
public class Damo {
    public static void main(String[] args) {
        System.out.println(isValid(700));
        System.out.println(isValid(565));

        System.out.println(isValid(70));
    }

    public static boolean isValid(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();

        if (chars.length == 1) {
            return 7 == n;
        }

        int result = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            int self = Integer.valueOf(chars[i]);
            int next = Integer.valueOf((chars[i + 1]));
            int value = Math.abs(Math.abs(self) - Math.abs(next));
            result = Math.abs(Math.abs(value) - result);
        }

        if (result == 7) {
            return true;
        }

        return false;
    }
}
