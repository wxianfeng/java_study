package com.wxianfeng.open.list;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/12 10:36 PM
 */
@Getter
@Setter
@Accessors(chain = true)
public class PersonData {
    private List<Person> persons;

    @Override
    public String toString() {
        return "PersonData{" +
                "persons=" + persons +
                '}';
    }
}
