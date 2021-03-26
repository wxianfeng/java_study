package com.wxianfeng.open.date_time;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * @author haomiao.wxf
 * @date 2021/01/15 11:42 AM
 */
public class StrToDt {
    public static void main(String[] args) {
        String dateStr = "2020-11-11";
        // String dateInString = "07/06-2013";
        try {
            Date date = DateUtils.parseDate(dateStr, new String[] { "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd" });
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(1 + 0.1);

        // double a = 2/0;

        Date date = new Date(200, 11, 12);

        System.out.println(date);
    }
}
