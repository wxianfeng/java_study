package com.wxianfeng.open.string;

/**
 * @author haomiao.wxf
 * @date 2021/04/23 10:12 AM
 *
 * https://blog.csdn.net/weixin_34261739/article/details/89657103
 * https://blog.csdn.net/daijiguo/article/details/79717394
 */
public class AddTest {
    public static void main(String[] args) {
        // 编译器会自动优化为 "ab"
        String s = "a" + "b";

        String s1 = "a";
        System.out.println(System.identityHashCode(s1));
        String s2 = "a";
        System.out.println(System.identityHashCode(s2));
        String s3 = new String("a");
        System.out.println(System.identityHashCode(s3));
        // true
        System.out.println(s1 == s2);
        // false
        System.out.println(s1 == s3);
        s1 += "b";
        System.out.println(System.identityHashCode(s1));
    }
}
