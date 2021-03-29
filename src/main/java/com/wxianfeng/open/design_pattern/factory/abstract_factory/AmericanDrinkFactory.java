package com.wxianfeng.open.design_pattern.factory.abstract_factory;

import com.wxianfeng.open.design_pattern.factory.simple_factory.AmericanCoffee;
import com.wxianfeng.open.design_pattern.factory.simple_factory.Coffee;

/**
 * @author haomiao.wxf
 * @date 2021/03/29 4:48 PM
 */
public class AmericanDrinkFactory implements AbstractDrinkFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Tea createTea() {
        return null;
    }
}
