package com.wxianfeng.open.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class BMW extends Car {
    private String country;
}
