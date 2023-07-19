package com.wxianfeng.open.base;

import java.util.Arrays;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/09/12 4:58 PM
 */
public class ByteTest {
    public static void main(String[] args) {
        // Long.parseLong(null);
        // Long.valueOf(null);
        // new Long(null);
        // NumberUtils.parseNumber(null, Long.class);
        org.apache.commons.lang.math.NumberUtils.createLong(null);

        Byte a = 1;
        System.out.println(0 == a);

        System.out.println((byte) 1 == a);

        System.out.println((byte) 1);

        String s = ",,,,";

        String[] data = s.split(",");

        System.out.println(data.length);

        // System.out.println(data[0]);
        // System.out.println(data[4]);
        // System.out.println(data[5]);

        String[] split = "337891466,昊淼科技,null,null,0,20210915".split(",");
        System.out.println(split.length);

        System.out.println("aaa" + null);

        String hanzi = "汉子";

        String py = "hz";

        System.out.println(Arrays.toString(hanzi.getBytes()));

        System.out.println(hanzi.getBytes().length);

        System.out.println(py.getBytes().length);
    }
}
