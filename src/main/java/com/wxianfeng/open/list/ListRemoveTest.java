package com.wxianfeng.open.list;

import com.alibaba.fastjson.JSON;
import com.wxianfeng.open.json.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haomiao.wxf
 * @date 2021/04/19 10:03 AM
 */
public class ListRemoveTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = Person.builder()
                .id(1L)
                .name("a")
                .rank(1)
                .build();
        Person p2 = Person.builder()
                .id(2L)
                .name("b")
                .rank(2)
                .build();
        Person p3 = Person.builder()
                .id(3L)
                .name("c")
                .rank(3)
                .build();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // list.remove(p2);
        System.out.println(list);

        String s = JSON.toJSONString(list);
        List<Person> personList = JSON.parseArray(s, Person.class);
        personList.remove(p2);
        System.out.println(personList);

        Person person = Person.builder().id(3L).name("c").rank(33).build();
        personList.remove(person);
        System.out.println(personList);

        personList.add(person);
        System.out.println(personList);
    }
}
