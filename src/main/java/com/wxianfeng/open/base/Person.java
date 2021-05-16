package com.wxianfeng.open.base;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/05/13 6:08 PM
 */
@Setter
@Getter
@Accessors(chain = true)
public class Person {
    private Long age;
}
