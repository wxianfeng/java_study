package com.wxianfeng.open.regexp;

import java.util.regex.Pattern;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/10/28 11:08 AM
 */
public class RegexpTest {
    public static void main(String[] args) {
        String s = "/article/SWA00GmlAqPuaiSgRJWltYeQxmAOTu2sap4Cl";
        System.out.println(s.matches("/article/\\w+"));

        System.out.println(Math.ceil((double)35 / 10));

        System.out.println(Math.ceil(3.5));

        String white = "https://ow.dingtalk.com";
        String quote = Pattern.quote(white);
        System.out.println(quote);
        String url = "https://ow.dingtalk.com/article/SWaskdljajkdhasjk";
        System.out.println(url.matches(quote));
        System.out.println(url.startsWith(white));
    }
}
