package com.wxianfeng.open.regexp;

import org.apache.ibatis.parsing.GenericTokenParser;
import org.apache.ibatis.parsing.TokenHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.cnblogs.com/xunianchong/p/6650545.html
 *
 * @author wang.fl1429@gmail.com
 * @date 2022/02/10 3:39 PM
 */
public class GenericTokenParserTest {
    public static void main(String[] args) {
        final Map<String,Object> mapper = new HashMap<String, Object>();
        mapper.put("name", "张三");
        mapper.put("pwd", "123456");

        //先初始化一个handler
        TokenHandler handler = new TokenHandler() {
            @Override
            public String handleToken(String content) {
                System.out.println(content);
                return (String) mapper.get(content);
            }
        };
        GenericTokenParser parser = new GenericTokenParser("${", "}", handler);
        System.out.println("************" + parser.parse("用户：${name}，你的密码是:${pwd}"));

        System.out.println("************" + parser.parse("用户，你的密码是:"));
    }
}
