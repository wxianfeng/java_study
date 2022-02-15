package com.wxianfeng.open.date_time;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author haomiao.wxf
 * @date 2021/01/15 11:42 AM
 */
public class StrToDt {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2020-11-11";
        // String dateInString = "07/06-2013";
        try {
            Date date = DateUtils.parseDate(dateStr, new String[] { "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd" });
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 20220213
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyyMMdd");
        String format = simpleDateFormat1.format(simpleDateFormat.parse("2022-02-13"));
        System.out.println(format);

        System.out.println(1 + 0.1);

        // double a = 2/0;

        Date date = new Date(200, 11, 12);

        System.out.println(date);

        // 2022-02-11
        System.out.println(DateTimeUtil.getTomorrowDate());

        String dt = DateTimeUtil.getTomorrowDate() + " " + "10:00:00";
        long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(dt, new ParsePosition(0)).getTime() / 1000;
        // 1644544800
        System.out.println(time);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
