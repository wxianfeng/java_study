package com.wxianfeng.open.base;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/26 11:16 PM
 */
public class MemberVariableTest {
    /**
     * 成员变量
     */
    private String articleId = "e";

    public void init() {
        articleId = "abc";
    }

    public static void main(String[] args) {
        MemberVariableTest memberVariableTest = new MemberVariableTest();
        memberVariableTest.init();

        // abc
        System.out.println(memberVariableTest.articleId);
    }
}
