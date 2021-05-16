package com.wxianfeng.open.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/12 2:57 PM
 */
public class AnyMatchTest {
    public static void main(String[] args) {
        Long l = new Long(400);
        List<Long> longList = Arrays.asList(1L, 2L, 3L, l);

        Boolean b = longList.stream().anyMatch(aLong -> aLong == 1L);
        Boolean b1 = longList.stream().anyMatch(aLong -> aLong == 4L);
        Long ll = new Long(400);
        Boolean b2 = longList.stream().anyMatch(aLong -> aLong == ll);
        Boolean b3 = longList.stream().anyMatch(aLong -> aLong.equals(ll));
        // true
        System.out.println(b);
        // false
        System.out.println(b1);
        // false
        System.out.println(b2);
        // true
        System.out.println(b3);
    }
}
