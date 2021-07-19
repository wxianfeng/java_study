package com.wxianfeng.open.klass;

import lombok.ToString;

import java.util.Objects;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/07/05 10:35 AM
 */
@ToString(callSuper = true)
public class Man extends Person {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return Objects.equals(age, man.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
