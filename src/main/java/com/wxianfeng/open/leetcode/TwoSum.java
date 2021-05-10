package com.wxianfeng.open.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haomiao.wxf
 * @date 2021/01/22 11:58 PM
 *
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 4};
        int target = 6;

        int[] res = twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);

        int[] res1 = twoSumUseHash(nums, target);
        System.out.println(res1[0]);
        System.out.println(res1[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            // System.out.println(i);
            int a = nums[i];
            boolean find = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int b = nums[j];

                if (a + b == target) {
                    //System.out.println( a+ b);
                    //System.out.println(i);
                    arr[0] = i;
                    arr[1] = j;
                    find = true;
                    break;
                }
            }
            if (find) {
                break;
            }
        }

        return arr;
    }

    public static int[] twoSumUseHash(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            System.out.println(hashtable);
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        System.out.println("not reach here");
        return new int[0];
    }
}
