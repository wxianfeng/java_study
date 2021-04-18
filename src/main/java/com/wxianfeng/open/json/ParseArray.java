package com.wxianfeng.open.json;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haomiao.wxf
 * @date 2021/04/18 11:18 PM
 */
public class ParseArray {
    public static void main(String[] args) {
        // List 转 json string
        // https://blog.csdn.net/weixin_30294021/article/details/95424028
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
        String s = JSON.toJSONString(list);
        // [{"id":1,"name":"a","rank":1},{"id":2,"name":"b","rank":2},{"id":3,"name":"c","rank":3}]
        System.out.println(s);

        // json string 转 List
        // https://www.cnblogs.com/qingmuchuanqi48/p/11622399.html
        List<Person> personList = JSON.parseArray(s, Person.class);
        personList.forEach(person -> {
            String txt = person.getName() + " " + person.getRank();
            //a 1
            //b 2
            //c 3
            System.out.println(txt);
        });
    }
}
