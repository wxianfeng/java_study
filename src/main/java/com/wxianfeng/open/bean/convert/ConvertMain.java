package com.wxianfeng.open.bean.convert;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/06/26 8:17 PM
 */
public class ConvertMain {
    public static void main(String[] args) {
        LikeRequest likeRequest = new LikeRequest()
                .setId("1")
                .setType("Comment");
        List<LikeRequest> list = Arrays.asList(likeRequest);
        List<LikeBean> likeBeans = list.stream().map(convert()).collect(Collectors.toList());
        System.out.println(likeBeans);

        LikeBean likeBean = convert().apply(likeRequest);
        System.out.println(likeBean);
    }

    private static Function<LikeRequest, LikeBean> convert() {
        return request -> {
            LikeBean likeBean = new LikeBean();
            likeBean.setTargetId(request.getId());
            likeBean.setTargetType(request.getType());
            return likeBean;
        };
    }
}
