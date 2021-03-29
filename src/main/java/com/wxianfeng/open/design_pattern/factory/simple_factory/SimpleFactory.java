package com.wxianfeng.open.design_pattern.factory.simple_factory;

/**
 * @author haomiao.wxf
 * @date 2021/03/26 5:11 PM
 */
public class SimpleFactory {
    public static String createCoffee(String type) {
        if ("china".equals(type)) {
            return new ChinaCoffee().name();
        } else if ("american".equals(type)) {
            return new AmericanCoffee().name();
        } else if ("latte".equals(type)) {
            return new Latte().name();
        } else {
            throw new UnsupportedOperationException(type + " is not Support");
        }
    }

    public static void main(String[] args) {
        String coffee = SimpleFactory.createCoffee("china");

        System.out.println(coffee);
    }
}
