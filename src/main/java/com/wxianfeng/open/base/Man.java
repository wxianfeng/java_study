package com.wxianfeng.open.base;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/10/12 10:23 PM
 */
public class Man {
    public static void main(String[] args) {
        // false
        System.out.println(StringUtils.isNumeric("-1"));

        // false
        System.out.println(NumberUtils.isDigits("-1"));


        // 拆箱 NPE
        Integer a = null;
        // int b = a;

        Person person = null;
        if (person == null || person.getAge() == null || person.getAge() == 0L) {
            System.out.println("xxx");
        }
    }
}
