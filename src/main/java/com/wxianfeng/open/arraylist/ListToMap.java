package com.wxianfeng.open.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author haomiao.wxf
 * @date 2021/04/01 4:51 PM
 */
public class ListToMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList() {
            {
                add("a");
                add("b");
                add("c");
            }
        };

        HashMap hashMap = new HashMap();

        for (String s: list) {
            hashMap.put(s, 1);
        }

        System.out.println(hashMap);
    }
}
