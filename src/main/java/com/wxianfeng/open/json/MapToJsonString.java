package com.wxianfeng.open.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * https://www.cnblogs.com/panchanggui/p/10972520.html
 *
 * @author wang.fl1429@gmail.com
 * @date 2021/09/08 11:43 AM
 */
public class MapToJsonString {
    public static void main(String[] args) {
        Map<String, Integer> map = ImmutableMap.of("a", 1, "b", 2);
        String s = JSON.toJSONString(map);
        System.out.println(s);
        Map<String, Object> map1 = JSONObject.parseObject(s);
        System.out.println(map1.get("a"));
    }
}
