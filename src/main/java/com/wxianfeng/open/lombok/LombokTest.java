package com.wxianfeng.open.lombok;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author haomiao.wxf
 * @date 2021/04/21 9:27 PM
 */
public class LombokTest {
    public static void main(String[] args) {
        Car car = new Car().setName("Tesla")
                .setColor("Black");
        System.out.println(car);

        Car car1 = new Car();
        car1.setName("BMW");
        // car1.setColor("Blue");
        System.out.println(car1);

        Long[] numbers = {1L, 1000L, 100L};
        Arrays.sort(numbers, Collections.reverseOrder());

        for (long number : numbers) {
            System.out.println(number);
        }

        //System.out.println(numbers);

        // 注意用父类声明
        Car bmw = new BMW()
                .setCountry("德国") // 注意先 set 子类
                .setName("bmw")
                .setColor("blue");

        System.out.println(JSON.toJSONString(bmw));
    }
}
