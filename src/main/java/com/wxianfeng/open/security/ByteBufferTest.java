package com.wxianfeng.open.security;

import java.nio.ByteBuffer;

/**
 * Created by haomiao on 5/16/17.
 *
 * @author haomiao
 * @date 2017/05/16
 */
public class ByteBufferTest {
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
        String action = "add,remove";

        int byteLength = 4 + 4 + 1 + appKey.length() + 1 + outerId.length() + 2 + action.length();

        ByteBuffer data = ByteBuffer.allocate(byteLength);
        // 写入token 生成时间
        data.putInt(t);
        // 写入 token 失效时间
        data.putInt(t);
        // 写入 appkey 长度
        data.put((byte) appKey.length());
        // 写入 appkey 数据
        data.put(appKey.getBytes());
        // 写入 outerId 长度
        data.put((byte) outerId.length());
        // 写入 outerId 数据
        data.put(outerId.getBytes());
        // 写入 action 长度
        data.putShort((short) action.length());
        // 写入 action 数据
        data.put(action.getBytes());

        String s = MyBase64.encodeToString(data.array(), MyBase64.DEFAULT);
        System.out.println(s);

        // 反解
        byte[] deData = MyBase64.decode(s, MyBase64.DEFAULT);
        ByteBuffer deBuf = ByteBuffer.wrap(deData);

        // 读出 token 创建时间
        int tokenCreate = deBuf.getInt();
        System.out.println(tokenCreate);

        // 读出 token 失效时间
        int tokenExpire = deBuf.getInt();
        System.out.println(tokenExpire);

        // 读出 appKey 长度
        int appKeyLength = deBuf.get() & 0xFF;
        System.out.println(appKeyLength);

        // 读出 appKey 值
        byte[] appkeyByte = new byte[appKeyLength];
        deBuf.get(appkeyByte, 0, appKeyLength);
        String appkey = new String(appkeyByte);
        System.out.println(appkey);

        // 读出 outerId 长度
        int outerIdLength = deBuf.get() & 0xFF;
        System.out.println(outerIdLength);

        // 读出 outerId 数据
        byte[] outerIdByte = new byte[outerIdLength];
        deBuf.get(outerIdByte, 0, outerIdLength);
        String deOuterId = new String(outerIdByte);
        System.out.println(deOuterId);

        // 读出 action 长度
        short actionLength = deBuf.getShort();
        System.out.println(actionLength);

        // 读出 action 数据
        byte[] deActionByte = new byte[actionLength];
        deBuf.get(deActionByte, 0, actionLength);
        String deAction = new String(deActionByte);
        System.out.println(deAction);
    }
}
