package com.wxianfeng.open.design_pattern.factory.abstract_factory;

import com.wxianfeng.open.design_pattern.factory.simple_factory.Coffee;
import com.wxianfeng.open.design_pattern.factory.simple_factory.Latte;

/**
 * @author haomiao.wxf
 * @date 2021/03/29 4:47 PM
 */
public class ChinaDrinksFactory implements AbstractDrinkFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Tea createTea() {
        return null;
    }
}
