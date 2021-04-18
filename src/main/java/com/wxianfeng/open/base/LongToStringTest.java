package com.wxianfeng.open.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author haomiao.wxf
 * @date 2021/04/02 3:11 PM
 */
public class LongToStringTest {
    public static void main(String[] args) {
        Long id = null;
        // NPE
        // Long.toString(id);
        // "null"
        System.out.println(String.valueOf(id));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.format(new Date());
    }
}
