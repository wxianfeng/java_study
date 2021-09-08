package com.wxianfeng.open.leetcode.dingcode;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/08/10 2:15 PM
 */

import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *生产者
 **/
public class Producer implements Runnable {

    private volatile boolean isRunning = true;
    int capacity = 100;
    PriorityBlockingQueue<ObjectData> queue = new PriorityBlockingQueue(capacity, new Comparator<ObjectData>() {
        @Override
        public int compare(ObjectData i1, ObjectData i2) {
            return i2.getData() - i1.getData();
        }
    });

    public Producer(PriorityBlockingQueue<ObjectData> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        if (isRunning) {

            Random r = new Random();
            System.out.println("start product id:" + Thread.currentThread().getId());
            try {

                for (int i = 0; i < 100; i++) {
                    Thread.sleep(10 + r.nextInt(190)); //停顿 10~200毫秒

                    System.out.println(i+1 + " 加入队列");
                    if (!queue.offer(new ObjectData(i + 1), 2, TimeUnit.SECONDS)) {
                        System.err.println(i + 1 + " 加入队列失败");
                    }
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }

        }
    }

    public void stop() {
        isRunning = false;
    }


}