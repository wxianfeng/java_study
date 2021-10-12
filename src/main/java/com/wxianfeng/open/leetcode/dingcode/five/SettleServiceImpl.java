package com.wxianfeng.open.leetcode.dingcode.five;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/09/10 2:02 PM
 */

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 订单支付成功后，需要在指定时间把钱全额分账给各个参与方
 * 下列代码是生成结算账单的逻辑
 *
 * @author shawnzhan.zxy
 */
public class SettleServiceImpl {

    private static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

    private static final String YYYY_MM_DD = "YYYY-MM-dd";

    /**
     * 订单支付成功后生成结算单
     */
    public List<ClearingSplit> settle(Long orderId) {
        List<ClearingSplit> clearingSplitList = Lists.newArrayList();
        OrderDTO order = getOrderById(orderId);
        //订单总金额
        BigDecimal totalPayFee = new BigDecimal(order.getTotalPayFee());

        //结算日计算
        String settleDate = formatDate(offsetDay(new Date(), order.getSettleCycle()), YYYY_MM_DD);
        //如果是平台全额收款，结算日设为-1
        String dingdingOrgRatio = order.getRatioCodes().split(":")[0];
        if (ONE_HUNDRED.equals(new BigDecimal(dingdingOrgRatio))) {
            settleDate = formatDate(offsetDay(new Date(), -1), YYYY_MM_DD);
        }

        //参与方结算单计算
        String[] ratioCodes = order.getRatioCodes().split(":");
        String[] participantArr = order.getParticipants().split(":");
        //二方 直销(平台方:产品方)
        if (participantArr.length == 2) {
            //平台分成信息
            BigDecimal platformFee = totalPayFee.multiply(new BigDecimal(ratioCodes[0])).divide(ONE_HUNDRED).setScale(0, BigDecimal.ROUND_HALF_UP);
            clearingSplitList.add(new ClearingSplit(Long.parseLong(participantArr[0]), platformFee.longValue(), settleDate));

            //ISV分成信息
            BigDecimal isvFee = totalPayFee.multiply(new BigDecimal(ratioCodes[1])).divide(ONE_HUNDRED).setScale(0, BigDecimal.ROUND_HALF_UP);
            clearingSplitList.add(new ClearingSplit(Long.parseLong(participantArr[1]), isvFee.longValue(), settleDate));
        }
        //三方 分销(平台方:产品方:分销商)
        else if (participantArr.length == 3) {
            //如果平台不抽佣，分给分销商
            double platformRatio = new Double(ratioCodes[0]);
            double distRatio = new Double(ratioCodes[2]);
            if ("Y".equals(order.getFreeCommission())) {
                distRatio = platformRatio + distRatio;
                platformRatio = 0;
            }
            //平台分成信息
            BigDecimal platformFee = totalPayFee.multiply(new BigDecimal(platformRatio)).divide(ONE_HUNDRED).setScale(0, BigDecimal.ROUND_HALF_UP);
            clearingSplitList.add(new ClearingSplit(Long.parseLong(participantArr[0]), platformFee.longValue(), settleDate));

            //ISV分成信息
            BigDecimal isvFee = totalPayFee.multiply(new BigDecimal(ratioCodes[1])).divide(ONE_HUNDRED).setScale(0, BigDecimal.ROUND_HALF_UP);
            clearingSplitList.add(new ClearingSplit(Long.parseLong(participantArr[1]), isvFee.longValue(), settleDate));

            //分销分成信息
            BigDecimal distFee = totalPayFee.multiply(new BigDecimal(distRatio)).divide(ONE_HUNDRED).setScale(0, BigDecimal.ROUND_HALF_UP);
            clearingSplitList.add(new ClearingSplit(Long.parseLong(participantArr[2]), distFee.longValue(), settleDate));
        }
        return clearingSplitList;
    }

    public static Date offsetDay(Date source, int offset) {
        Long sourceTime = source.getTime();
        Long targetTime = sourceTime + (offset * 24 * 60 * 60 * 1000);
        return new Date(targetTime);
    }

    public static String formatDate(Date d, String pattern) {
        return new SimpleDateFormat(pattern).format(d);
    }

    /**
     * 清分结算账单明细
     */
    @Data
    @AllArgsConstructor
    static class ClearingSplit {

        /**
         * 分账账户
         */
        private Long aliyunId;

        /**
         * 分润金额 单位分
         */
        private Long settleFee;

        /**
         * 结算日
         */
        private String settleDate;
    }

    /**
     * 订单数据
     */
    @Data
    @AllArgsConstructor
    static class OrderDTO {

        /**
         * 订单金额（单位分）
         */
        private Long totalPayFee;

        /**
         * 结算周期
         */
        private Integer settleCycle;

        /**
         * 分润比例
         */
        private String ratioCodes;

        /**
         * 分润方
         */
        private String participants;

        /**
         * 是否免佣金
         */
        private String freeCommission;
    }

    /**
     * mock数据
     * 仅示例，不在该方法中找问题
     */
    private OrderDTO getOrderById(Long orderId) {
        if (orderId.equals(123L)) {
            return new OrderDTO(100L, 5, "30.0:30.0:40.0", "10752:44477186:457116", "N");
        }
        throw new RuntimeException("订单未找到");
    }

    public static void main(String[] args) {
        SettleServiceImpl settleService = new SettleServiceImpl();
        List<ClearingSplit> clearingSplitList = settleService.settle(123L);
        System.out.println("clearingSplitList=" + JSON.toJSON(clearingSplitList));
    }

}
