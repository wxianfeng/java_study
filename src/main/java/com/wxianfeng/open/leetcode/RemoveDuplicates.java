package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/01/26 2:00 AM
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
