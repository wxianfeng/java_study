package com.wxianfeng.open.list;

import com.wxianfeng.open.json.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author haomiao.wxf
 * @date 2021/04/21 4:21 PM
 */
public class ContainsTest {
    public static void main(String[] args) {
        Person person = new Person();
        List<Person> personList = Arrays.asList(
           Person.builder().name("a").rank(100).build(),
           Person.builder().name("b").build(),
           Person.builder().name("c").build()
        );

        System.out.println(personList);

        Person person1 = Person.builder().name("a").build();
        Person person2 = Person.builder().name("a").rank(200).build();

        // false
        System.out.println(personList.contains(person));
        // true
        System.out.println(personList.contains(person1));
        // true
        System.out.println(personList.contains(person2));
    }
}
