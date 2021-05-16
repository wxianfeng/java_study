package com.wxianfeng.open.longTest;

import com.wxianfeng.open.base.Person;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/13 6:08 PM
 */
public class LongEqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person().setAge(68315L);
        Person p2 = new Person().setAge(68315L);

        // false
        System.out.println(p1.getAge() == p2.getAge());

        Person p3 = new Person().setAge(127L);
        Person p4 = new Person().setAge(127L);

        // true
        System.out.println(p3.getAge() == p4.getAge());

        Long l1 = new Long(78901L);
        Long l2 = new Long(78901L);
        // false
        System.out.println(l1 == l2);
        long l3 = 12345L;
        long l4 = 12345L;
        // true
        System.out.println(l3 == l4);
    }
}
