package com.wxianfeng.open.design_pattern.factory.factory_method;

import com.wxianfeng.open.design_pattern.factory.simple_factory.AmericanCoffee;
import com.wxianfeng.open.design_pattern.factory.simple_factory.Coffee;
import com.wxianfeng.open.design_pattern.factory.simple_factory.Latte;

/**
 * @author haomiao.wxf
 * @date 2021/03/26 5:29 PM
 */
public class AmericanCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[] {new AmericanCoffee(), new Latte()};
    }
}
