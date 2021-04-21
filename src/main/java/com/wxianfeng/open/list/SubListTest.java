package com.wxianfeng.open.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haomiao.wxf
 * @date 2021/04/19 12:20 AM
 */
public class SubListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < 10) {
            i++;
            list.add(i);
        }
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(list);
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(list.subList(0, 10));

        System.out.println(list.subList(0, Integer.min(20, list.size())));
    }
}
