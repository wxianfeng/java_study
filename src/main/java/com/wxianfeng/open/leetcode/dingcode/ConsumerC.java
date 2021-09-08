package com.wxianfeng.open.leetcode.dingcode;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/08/10 2:30 PM
 */

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author jueju
 * @date 2021/8/3 20:07
 * @modified By:
 * @description:
 * 能够被3整除
 */
public class ConsumerC implements Runnable {

    private PriorityBlockingQueue<ObjectData> queue;

    /**
     * 优先消费队列
     *
     * @param queue
     */
    public ConsumerC(PriorityBlockingQueue<ObjectData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start ConsumerC id :" + Thread.currentThread().getId());

        try {
            while (true) {
                ObjectData data = queue.take();
                if (data != null) {
                    if (data.isTrip() == false && data.getData() % 3 == 0) {
                        //消费完成
                        System.out.println("可以被3整除的数：" + data);
                        data.setTrip(true);
                    } else {
                        //  不能被3整除的，繁缛队列
                        queue.offer(data);
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}
