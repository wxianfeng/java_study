package com.wxianfeng.open.json;

import lombok.Builder;
import lombok.Data;

/**
 * @author haomiao.wxf
 * @date 2021/04/18 11:18 PM
 */
@Data
@Builder
public class Person {
    private Long id;
    private String name;
    private Integer rank;
}
