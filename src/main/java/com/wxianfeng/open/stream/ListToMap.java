package com.wxianfeng.open.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by haomiao on 2020/05/26 10:56 PM
 */
public class ListToMap {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("a", "b", "a");

        Map<String, Object> strMap = strs.stream().collect(Collectors.toMap(String::toString, (v) -> 1, (oldValue, newValue) -> oldValue));

        System.out.println(strMap);
    }
}
