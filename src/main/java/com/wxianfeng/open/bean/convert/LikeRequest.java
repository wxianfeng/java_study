package com.wxianfeng.open.bean.convert;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/26 5:59 PM
 */
@Setter
@Getter
@Accessors(chain = true)
@ToString
public class LikeRequest {
    private String type;
    private String id;
}
