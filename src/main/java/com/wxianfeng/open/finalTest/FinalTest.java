package com.wxianfeng.open.finalTest;

/**
 * @author haomiao.wxf
 * @date 2020/12/10 12:02 AM
 */
public class FinalTest {
    private final String token;

    public FinalTest(String token) {
        this.token = token;
        // https://blog.csdn.net/xufei512/article/details/50773710
        // final 的变量，只能被赋值一次
        // this.token = "222";
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest("imToken");
        System.out.println(finalTest.token);

        FinalTest finalTest1 = new FinalTest("imToken2");
        System.out.println(finalTest1.token);
    }
}
