package com.wxianfeng.open.bean.copy;

import org.springframework.beans.BeanUtils;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/18 3:49 PM
 */
public class BeanTest {
    public static void main(String[] args) {
        AMore aMore = new AMore()
                .setName("AMore")
                .setAge(12);
        A a = new A();
        BeanUtils.copyProperties(aMore, a);

        System.out.println(a);

        // Exception in thread "main" java.lang.IllegalArgumentException: Source must not be null
        BeanUtils.copyProperties( null, a);
        System.out.println(a);
    }
}
