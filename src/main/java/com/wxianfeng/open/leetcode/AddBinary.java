package com.wxianfeng.open.leetcode;

import org.apache.commons.lang3.StringUtils;

/**
 * @author haomiao.wxf
 * @date 2021/01/24 1:23 PM
 *
 * https://leetcode-cn.com/problems/add-binary/
 */
public class AddBinary {
    public static void main(String[] args) {
        // System.out.println(add("11", "1"));
        System.out.println(addByCarry("11", "1"));

        // System.out.println(String.valueOf(0));
    }

    /**
     * 转化成 10 进制思路，超过 Integer 范围会有问题
     * @param a
     * @param b
     * @return
     */
    public static String add(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);

        int resInt = aInt + bInt;

        String resStr = Integer.toBinaryString(resInt);

        return resStr;
    }

    /**
     * 二进制进位的思路
     * @param a
     * @param b
     * @return
     */
    public static String addByCarry(String a, String b) {
        StringBuffer stringBufferA = new StringBuffer(a);
        String aReverse = stringBufferA.toString();
        // 反转字符串，从地位往高位算
        StringBuffer stringBufferB = new StringBuffer(b);
        String bReverse = stringBufferB.toString();

        // 获取最大位数
        int n = Math.max(aReverse.length(), bReverse.length());
        // 补全长度相等
        if (aReverse.length() > bReverse.length()) {
            bReverse = StringUtils.rightPad(bReverse, aReverse.length(), '0');
        } else {
            aReverse = StringUtils.rightPad(aReverse, bReverse.length(), '0');
        }

        System.out.println(aReverse);
        System.out.println(bReverse);

        // 下一位进位的值
        int carry = 0;
        // 反转后的结果
        StringBuffer result = new StringBuffer();

        // 按位运算
        for (int i = 0; i < n; i++) {
            char aChar = aReverse.charAt(i);
            char bChar = bReverse.charAt(i);

            // 这位算出的值
            int idxValue = ((int) aChar + (int) bChar + carry) % 2;
            // System.out.println(idxValue);
            result.append(String.valueOf(idxValue));

            // System.out.println(result);

            // 是否进位到下一位
            if (((int) aChar + (int) bChar + carry) >= 2) {
                carry = 1;
            }
        }

        System.out.println("carry: " + carry);
        // 如果最后是要进位，补 1
        if (carry > 0) {
            result.append('1');
        }

        // System.out.println(result);
        // 结果，左高右低
        return result.reverse().toString();
    }
}
