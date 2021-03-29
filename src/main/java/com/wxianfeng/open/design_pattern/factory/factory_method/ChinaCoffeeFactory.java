package com.wxianfeng.open.design_pattern.factory.factory_method;

import com.wxianfeng.open.design_pattern.factory.simple_factory.ChinaCoffee;
import com.wxianfeng.open.design_pattern.factory.simple_factory.Coffee;
import com.wxianfeng.open.design_pattern.factory.simple_factory.Latte;

/**
 * @author haomiao.wxf
 * @date 2021/03/26 5:29 PM
 */
public class ChinaCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[] {new Latte(), new ChinaCoffee()};
    }
}
