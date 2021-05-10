package com.wxianfeng.open.ENUM;

/**
 * Created by haomiao on 2020/05/28 4:08 PM
 */
public class OrderStateTest {
    public static void main(String[] args) {
        System.out.println(OrderState.valueOf(OrderState.FINISHED.name()).getDisplayName());
    }
}
