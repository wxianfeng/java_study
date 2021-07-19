package com.wxianfeng.open.klass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/07/07 10:49 PM
 */
@Setter
@Getter
@Accessors(chain = true)
@ToString(callSuper = true)
public class ManSonSon extends Man {
    private Integer sex;
}
