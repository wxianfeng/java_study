package com.wxianfeng.open.design_pattern.factory.abstract_factory;

import com.wxianfeng.open.design_pattern.factory.factory_method.AmericanCoffeeFactory;

/**
 * @author haomiao.wxf
 * @date 2021/03/29 4:48 PM
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ChinaDrinksFactory chinaDrinksFactory = new ChinaDrinksFactory();
        chinaDrinksFactory.createCoffee();

        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        americanCoffeeFactory.createCoffee();
    }
}
