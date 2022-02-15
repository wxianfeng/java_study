package com.wxianfeng.open.date_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @date 2021/06/21 7:58 PM
 */
public class DateTimeUtil {
    /**
     * 最近一周起始时间
     *
     * @return
     */
    public static String getRecentWeekStart() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -7);
        Date start = c.getTime();

        return sdf.format(start);
    }

    /**
     * 获取今天开始时间
     *
     * @return
     */
    public static String getTodayStart() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");

        return sdf.format(date);
    }

    /**
     * 昨天的日期时间区间
     *
     * @return
     */
    public static String[] getYesterdayRange() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -1);
        Date date = c.getTime();
        String startStr = sdf.format(date);
        SimpleDateFormat sdfEnd = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        String endStr = sdfEnd.format(date);

        return new String[]{startStr, endStr};
    }

    /**
     * 昨天的日期
     *
     * @return
     */
    public static String getYesterdayDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -1);
        Date date = c.getTime();

        return sdf.format(date);
    }

    /**
     * 今天的日期
     *
     * @return
     */
    public static String getTodayDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        return sdf.format(date);
    }

    /**
     * 明天的日期
     *
     * @return
     */
    public static String getTomorrowDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, +1);
        Date date = c.getTime();

        return sdf.format(date);
    }

    /**
     * 当前日期时间
     *
     * @return
     */
    public static String getNowDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();

        return sdf.format(date);
    }

    /**
     * 前天的日期时间区间
     *
     * @return
     */
    public static String[] getBeforeYesterdayRange() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -2);
        Date date = c.getTime();
        String startStr = sdf.format(date);
        SimpleDateFormat sdfEnd = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        String endStr = sdfEnd.format(date);

        return new String[]{startStr, endStr};
    }
}
