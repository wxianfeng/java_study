package com.wxianfeng.open.leetcode.dingcode;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/08/10 2:30 PM
 */

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author jueju
 * @date 2021/8/3 20:04
 * @modified By:
 * @description:
 * B消费者
 */
public class ConsumerB implements Runnable {

    private PriorityBlockingQueue<ObjectData> queue;

    /**
     * 优先消费队列
     *
     * @param queue
     */
    public ConsumerB(PriorityBlockingQueue<ObjectData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start ConsumerB id :" + Thread.currentThread().getId());

        try {
            while (true) {
                ObjectData data = queue.take();
                if (data != null) {
                    if (data.isEven() == false && data.getData() % 2 == 0) {

                        //消费完成
                        System.out.println("可以被2整除的数：" + data);
                        data.setEven(true);
                    }else {
                        //不能被2整除的
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
