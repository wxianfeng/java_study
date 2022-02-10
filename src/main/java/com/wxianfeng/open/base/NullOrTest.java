package com.wxianfeng.open.base;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/11/22 5:14 PM
 */
public class NullOrTest {
    public static void main(String[] args) {
        Boolean b = null;
        // NPE
//        System.out.println(b || true);
        // NPE
        System.out.println(b == true || true);
    }
}
