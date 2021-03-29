package com.wxianfeng.open.design_pattern.factory.factory_method;

import com.wxianfeng.open.design_pattern.factory.simple_factory.Coffee;

/**
 * @author haomiao.wxf
 * @date 2021/03/26 5:30 PM
 *
 * 工厂方法
 * https://developer.aliyun.com/article/725085
 */
public abstract class CoffeeFactory {
    public abstract Coffee[] createCoffee();
}
