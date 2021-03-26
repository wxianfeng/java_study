package com.wxianfeng.open.ENUM;

import org.apache.commons.lang.StringUtils;

/**
 * Created by haomiao on 2020/05/28 4:08 PM
 */
public enum OrderState {
    CREATED("已创建"),
    PASSENGER_PREPAID("已预付"),
    DRIVER_DEPARTURE("车主已出发"),
    ARRIVED_ORIGIN("车主已到达出发地"),
    PASSENGER_ONBOARD("乘客已上车"),
    ARRIVED_DEST("已到达乘客目的地"),
    FINISHED("已完成"),
    CANCELLED("已取消"),
    TO_EVALUATE("待评价");

    private String displayName;

    private OrderState(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public static OrderState valueFor(String state) {
        if (StringUtils.isBlank(state)) {
            return null;
        } else {
            try {
                return valueOf(state);
            } catch (IllegalArgumentException var2) {
                return null;
            }
        }
    }
}