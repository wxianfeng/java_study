package com.wxianfeng.open.iterrtor;

/**
 * @author haomiao
 * @date 2020/06/22 8:26 PM
 */
public class Test {
    public static void main(String[] args) {
        int i = 0;
        int a = i++;
        // 0
        System.out.println(String.valueOf(a));

        int j = 0;
        int b = ++j;
        // 1
        System.out.println(b);

        for (int ii=0; ii< 5; ii++) {
            System.out.println(ii);
        }

        for (int jj=0; jj<5; ++jj) {
            System.out.println(jj);
        }
    }
}
