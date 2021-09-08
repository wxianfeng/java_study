package com.wxianfeng.open.leetcode;

/**
 * / 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * // 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * // 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * // 示例 1：
 * // 输入：l1 = [2,4,3], l2 = [5,6,4]
 * // 输出：[7,0,8]
 * // 解释：342 + 465 = 807.
 *
 * // 示例 2：
 * // 输入：l1 = [0], l2 = [0]
 * // 输出：[0]
 *
 * // 示例 3：
 * // 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * // 输出：[8,9,9,9,0,0,0,1]
 *
 *
 * // 提示：
 * // 每个链表中的节点数在范围 [1, 100] 内
 * // 0 <= Node.val <= 9
 * // 题目数据保证列表表示的数字不含前导零
 *
 * https://leetcode-cn.com/problems/add-two-numbers/solution/liang-shu-xiang-jia-by-leetcode-solution/
 *
 * https://blog.csdn.net/weixin_44407699/article/details/97612030
 * https://blog.csdn.net/cetrol_chen/article/details/79176387
 * https://blog.csdn.net/weixin_39747721/article/details/110721840
 * https://www.cnblogs.com/javayida/p/13346841.html
 *
 * @author wang.fl1429@gmail.com
 * @date 2021/05/15 6:37 PM
 */
public class AddTwoNumber {
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
//        System.out.println(listNode1);
//        ListNode listNode4 = new ListNode(9);
//        listNode3.next = listNode4;


        ListNode listNode11 = new ListNode(5);
        ListNode listNode22 = new ListNode(6);
        ListNode listNode33 = new ListNode(4);
        listNode11.next = listNode22;
        listNode22.next = listNode33;
//        System.out.println(listNode11);
        ListNode listNodeResult = addTwoNumbers(listNode1, listNode11);
        ListNode listNodeResult2 = addTwoNumbers2(listNode1, listNode11);

        System.out.println(listNodeResult);
        System.out.println(listNodeResult2);

        ListNode listNodeResult3 = addTwoNumbers3(listNode1, listNode11);
        System.out.println(listNodeResult3);

        ListNode listNodeResult4 = addTwoNumersMe(listNode1, listNode11);
        System.out.println(listNodeResult4);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean liHasNext = true;
        boolean l2HasNext = true;

        int sum = 0;
        ListNode listNode = new ListNode(0);
        ListNode endlistNode = new ListNode(0);
        listNode.next = endlistNode;
        while (liHasNext || l2HasNext || sum > 0) {
            int val = 0;
            int va2 = 0;
            if (liHasNext) {
                val = l1.val;
                l1 = l1.next;
                if (l1 == null) {
                    liHasNext = false;
                }
            } else {
                liHasNext = false;
            }
            if (l2HasNext) {
                va2 = l2.val;
                l2 = l2.next;
                if (l2 == null) {
                    l2HasNext = false;
                }
            } else {
                l2HasNext = false;
            }

            sum += val + va2;
            ListNode listNode1 = new ListNode(sum % 10);
            endlistNode.next = listNode1;
            endlistNode = listNode1;
            sum /= 10;
        }
        return listNode.next.next;
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return root.next;
    }

    public static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    /**
     * 因为输出的结果也是倒序输出的，所以直接从左向右加，向右进位即可，算出的链表就是输出的结果
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumersMe(ListNode l1, ListNode l2) {
        // 链表头
        ListNode head = null;
        // 移动的指针
        ListNode tail = new ListNode();
        // 刚开始指针和 head 在一起
        head = tail;
        int carry = 0;
        // 同时遍历两个链表
        while (l1 != null || l2 != null) {
            int n1 = l1.val;
            int n2 = l2.val;
            int sum = n1 + n2 + carry;
            if (sum >= 10) {
                // 该位置上的值
                sum = sum % 10;
                // 进位值
                carry = (n1 + n2 + carry) / 10;
            }
            tail.val = sum;
            l1 = l1.next;
            l2 = l2.next;
            // 下一个节点不为 null，结果的链表继续添加节点
            if (l1 != null || l2 != null) {
                tail.next = new ListNode();
            }
            tail = tail.next;
        }

        return head;
    }
}
