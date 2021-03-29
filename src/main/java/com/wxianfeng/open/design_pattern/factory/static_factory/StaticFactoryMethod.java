package com.wxianfeng.open.design_pattern.factory.static_factory;

/**
 * @author haomiao.wxf
 * @date 2021/03/26 4:02 PM
 *
 */
public class StaticFactoryMethod {
    /**
     * 静态工厂方法
     * https://www.liaoxuefeng.com/wiki/1252599548343744/1281319170474017
     *
     * @return
     */
    public static StaticFactoryMethod newInstance() {
        return new StaticFactoryMethod();
    }

    public static void main(String[] args) {
        StaticFactoryMethod.newInstance();
    }
}
