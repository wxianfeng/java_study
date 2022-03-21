package com.wxianfeng.open.date_time;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 * @author wang.fl1429@gmail.com
 * @date 2022/02/21 4:16 PM
 */
public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd_HH");
        String hour = simpleDateFormat.format(new Date());
        System.out.println(hour);

        HashSet<String> strings = Sets.newHashSet("a", "b");
        System.out.println(strings.contains("a"));
        System.out.println(strings.contains(null));

        //System.out.println(1 == null);

        System.out.println(1 == (byte) 1);

        List<String> days = Lists.newArrayList();
        // Exception
        System.out.println(days.get(days.size() - 1));

        String[] aa = new String[]{};
        System.out.println(aa[1]);
    }
}
