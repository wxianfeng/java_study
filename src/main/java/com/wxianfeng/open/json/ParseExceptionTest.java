package com.wxianfeng.open.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/19 11:30 AM
 */
public class ParseExceptionTest {
    public static void main(String[] args) {
        String str = "abc";

        try {
            // JSON.parseArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        // null
        System.out.println(JSON.parseObject(""));

        // null
        System.out.println(JSON.parseObject(null));
    }
}
