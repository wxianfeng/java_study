package com.wxianfeng.open.base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.math.NumberUtils;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/09/17 12:02 PM
 */
public class NumberUtilsTest {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String bizDate = dateFormat.format(new Date());
        System.out.println(bizDate);

        String b = null;
        String c = "10";
        String a = "10aa";
        // null
        System.out.println(NumberUtils.createInteger(b));
        // 10
        System.out.println(NumberUtils.createInteger(c));
        // NumberFormatException
        System.out.println(NumberUtils.createInteger(a));
    }
}
