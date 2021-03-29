package com.wxianfeng.open.design_pattern.factory.abstract_factory;

import com.wxianfeng.open.design_pattern.factory.simple_factory.Coffee;

/**
 * @author haomiao.wxf
 * @date 2021/03/29 4:44 PM
 *
 * 抽象工厂
 * https://developer.aliyun.com/article/725085
 */
public interface AbstractDrinkFactory {
    Coffee createCoffee();
    Tea createTea();
}
