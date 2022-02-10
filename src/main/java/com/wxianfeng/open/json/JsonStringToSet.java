package com.wxianfeng.open.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/11/23 5:21 PM
 */
public class JsonStringToSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = JSON.parseObject("[\"1\", \"2\"]", HashSet.class);
        System.out.println(hashSet.contains("1"));
        System.out.println(hashSet.contains("3"));

        Set<String> hashSet1 = JSON.parseObject("[\"1\", \"2\"]", new TypeReference<HashSet<String>>() {});
        System.out.println(hashSet1.contains("1"));
        System.out.println(hashSet1.contains("3"));

        System.out.println(Objects.equals(null, "true"));
    }
}
