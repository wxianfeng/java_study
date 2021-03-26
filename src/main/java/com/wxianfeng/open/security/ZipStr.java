package com.wxianfeng.open.security;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by haomiao on 5/16/17.
 *
 * @author haomiao
 * @date 2017/05/16
 */
public class ZipStr {

    // 压缩
    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return out.toString("ISO-8859-1");
    }


    // 解压缩
    public static String uncompress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(
            str.getBytes("ISO-8859-1"));
        GZIPInputStream gunzip = new GZIPInputStream(in);
        byte[] buffer = new byte[256];
        int n;
        while ((n = gunzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        // toString()使用平台默认编码，也可以显式的指定如toString("GBK")
        return out.toString();
    }

    public static void main(String[] args) throws Exception {
        String s = "appKey|outerId|tokenCreateTime|tokenExireTime|Action1,Action2";
        String com = ZipStr.compress(s);

        System.out.println(s.length());
        System.out.println(Base64.getEncoder().encode(s.getBytes()));
        System.out.println(com.wxianfeng.open.security.Base64.encode(s.getBytes(), 0));
        System.out.println(com.length());
        System.out.println(Base64.getEncoder().encode(com.getBytes()));
    }
}

