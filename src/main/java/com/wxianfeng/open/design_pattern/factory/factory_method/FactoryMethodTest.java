package com.wxianfeng.open.design_pattern.factory.factory_method;

import com.wxianfeng.open.design_pattern.factory.simple_factory.Coffee;

/**
 * @author haomiao.wxf
 * @date 2021/03/26 5:37 PM
 */
public class FactoryMethodTest {
    static void print(Coffee[] coffees) {
        for (Coffee coffee: coffees) {
            System.out.println(coffee.name());
        }
    }

    public static void main(String[] args) {
        ChinaCoffeeFactory chinaCoffeeFactory = new ChinaCoffeeFactory();
        Coffee[] coffees = chinaCoffeeFactory.createCoffee();
        System.out.println("中国工厂生产的咖啡:");
        print(coffees);

        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        Coffee[] coffees1 = americanCoffeeFactory.createCoffee();
        System.out.println("美国工厂生产的咖啡:");
        print(coffees1);
    }
}
