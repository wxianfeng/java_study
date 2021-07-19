package com.wxianfeng.open.stream;

import com.wxianfeng.open.klass.Man;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/07/08 4:37 PM
 */
public class DistinctTest {
    public static void main(String[] args) {
        Man man = new Man();
        man.setAge(1);
        man.setName("doudou");

        Man man1 = new Man();
        man1.setAge(1);
        man1.setName("xioaoqi");

        List<Man> manList = Arrays.asList(man, man1);
        List<Man> collect = manList.stream().distinct().collect(Collectors.toList());

        // [Man(super=Person(name=doudou), age=1)]
        System.out.println(collect);
    }
}
