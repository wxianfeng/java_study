package com.wxianfeng.open.arraylist;

import org.apache.commons.lang.ArrayUtils;

/**
 * @author haomiao
 * @date 2020/09/29 4:56 PM
 */
public class AL1 {
    public static void main(String[] args) {
        String customerDisable = "123";
        Long driverDomainId = 123L;
        String driverDomainId1 = "123";
        boolean b = !ArrayUtils.contains(customerDisable.split(","), driverDomainId);
        System.out.println(b); // true

        boolean b1 = !ArrayUtils.contains(customerDisable.split(","), driverDomainId1);
        System.out.println(b1); // false
    }
}
