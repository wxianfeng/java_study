package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/01/26 2:15 AM
 *
 * 二分查找
 */

class HalfSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index = halfSearch(arr, 8);
        System.out.println(index);

    }
    public static int halfSearch(int[] arr, int target) {
        int max = arr.length - 1;
        int min = 0;
        int mid = (max + min) / 2;
        while(max >= min) {
            if(target > arr[mid]) {
                min = mid + 1;
            } else if(target < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
            mid = (max + min) / 2;
        }
        return -1;
    }
}

