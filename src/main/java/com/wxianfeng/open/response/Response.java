package com.wxianfeng.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/17 5:07 PM
 */
@Setter
@Getter
@ToString
public class Response<T> {

    /**
     * 成功失败标识
     */
    private boolean success;

    /**
     * 相关消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    public static <T> Response<T> success() {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        return response;
    }

    public static <T> Response<T> fail(String message) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }

    public Response data(T d) {
        this.setData(d);
        return this;
    }
}
