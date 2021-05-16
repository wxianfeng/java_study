package com.wxianfeng.open.leetcode;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/15 6:39 PM
 */
public class ListNodeTest {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        System.out.println(l1);
        System.out.println(l2);
    }
}
