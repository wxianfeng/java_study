package com.wxianfeng.open.staticTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/07/02 10:43 PM
 */
public class StaticB {
    public static final Map<String, String> map = new HashMap<String, String>() {
        {
            put("a", StaticA.aa());
        }
    };

    public static void main(String[] args) {
        System.out.println(StaticB.map);
    }
}
