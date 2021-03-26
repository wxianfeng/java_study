package com.wxianfeng.open.security;

import java.nio.ByteBuffer;

/**
 * Created by haomiao on 5/16/17.
 *
 * @author haomiao
 * @date 2017/05/16
 */
public class ByteArray {
    public static void main(String[] args) {
        // tokenCreateTime: int 4个字节
        // tokenExpireTime: int 4个字节
        // appkey长度: byte 1 个字节
        // appKey: String 不定长
        // outerId 长度: byte 1 个字节
        // outerId: String 不定长
        // Action 长度: short 2 个字节
        // Action:  String 不定长

        // 生成二进制数据

        int t = 1494931084;
        String appKey = "nubia";
        String outerId = "283723467";
        String action = "add";

        int byteLength = 4 + 4 + 1 + appKey.length() + 1 + outerId.length();

        byte[] data = new byte[byteLength];

        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byte[] time = byteBuffer.putInt(t).array();
        data[0] = time[0];
        data[1] = time[1];
        data[2] = time[2];
        data[3] = time[3];
        byteBuffer.clear();

        byteBuffer = ByteBuffer.allocate(4);
        byte[] timeExpire = byteBuffer.putInt(t).array();
        data[4] = timeExpire[0];
        data[5] = timeExpire[1];
        data[6] = timeExpire[2];
        data[7] = timeExpire[3];
        byteBuffer.clear();

        data[8] = (byte) appKey.length();

        for (int i = 0; i < appKey.length(); i++) {
            data[8 + 1 + i] = (byte) appKey.charAt(i);
        }

        data[8 + appKey.length() + 1] = (byte) outerId.length();
        for (int i = 0; i < outerId.length(); i++) {
            data[8 + 1 + appKey.length() + 1 + i] = (byte) outerId.charAt(i);
        }

        String s = Base64.encodeToString(data, Base64.DEFAULT);

        System.out.println(s);

        // 反解

        byte[] data1 = Base64.decode(s, Base64.DEFAULT);
        ByteBuffer dataBuf = ByteBuffer.wrap(data1);
        int t1 = dataBuf.getInt();
        System.out.println(t1);

        int tokenExpire1 = dataBuf.getInt();
        System.out.println(tokenExpire1);

        int appkeyLength = dataBuf.get() & 0xFF;
        byte[] appkeyByte = new byte[appkeyLength];
        dataBuf.get(appkeyByte, 0, appkeyLength);
        String appkey1 = new String(appkeyByte);
        System.out.println(appkey1);

        int outerIdLength = dataBuf.get() & 0xFF;
        byte[] outerIdByte = new byte[outerIdLength];
        dataBuf.get(outerIdByte, 0, outerIdLength);
        String outerID1 = new String(outerIdByte);
        System.out.println(outerID1);

    }
}
