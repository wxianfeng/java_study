package com.wxianfeng.open.list;

import java.util.Arrays;
import java.util.List;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/12 10:30 PM
 */
public class SetValueTest {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person().setName("Jack Ma"), new Person().setName("Ma Lao Shi"));
        PersonData personData = new PersonData()
                .setPersons(personList);
        for (Person person : personData.getPersons()) {
            // 值会改变
            person.setName("AA");
        }

        System.out.println(personData);
    }
}
