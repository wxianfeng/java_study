package com.wxianfeng.open.leetcode.dingcode;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/08/10 2:34 PM
 */

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author jueju
 * @date 2021/8/3 20:09
 * @modified By:
 * @description:
 * 不能被2和3整除
 */
public class ConsumerD implements Runnable {

    private PriorityBlockingQueue<ObjectData> queue;

    /**
     * 优先消费队列
     *
     * @param queue
     */
    public ConsumerD(PriorityBlockingQueue<ObjectData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start ConsumerD id :" + Thread.currentThread().getId());

        try {
            while (true) {
                ObjectData data = queue.take();
                if (data != null) {
                    if ((data.getData() % 2 != 0) && (data.getData() % 3 != 0)) {

                        System.out.println("既不可以被2整除，也不可以被3整除的数：" + data);
                        data.setTrip(false);
                        data.setEven(false);

                    }else{
                        //能被2整除的或者被3整除的
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