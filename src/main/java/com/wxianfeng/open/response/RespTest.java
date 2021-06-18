package com.wxianfeng.open.response;

import com.wxianfeng.open.base.Person;

/**
 * Created by haomiao on 2020/03/12 12:14 AM
 */
public class RespTest {
    public static void main(String[] args) {
        Resp resp = new Resp();
        // System.out.println(resp.getCode());

        System.out.println(Response.success());

        System.out.println(Response.success().data(new Person()));
    }
}

