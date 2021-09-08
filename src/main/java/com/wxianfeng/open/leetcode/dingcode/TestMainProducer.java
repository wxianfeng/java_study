package com.wxianfeng.open.leetcode.dingcode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/08/10 2:34 PM
 */
class TestMainProducer {

    public static void main(String[] args) {
        try {
            PriorityBlockingQueue<ObjectData> queue = new PriorityBlockingQueue<>();
            Producer p1 = new Producer(queue);
            ConsumerB b1 = new ConsumerB(queue);

            ConsumerC c1 = new ConsumerC(queue);
            ConsumerD d1 = new ConsumerD(queue);
            ExecutorService service = Executors.newCachedThreadPool();
            service.execute(p1);

            service.execute(b1);
            service.execute(c1);
            service.execute(d1);
            p1.stop();
            Thread.sleep(3000);
            service.shutdown();
        }catch (Exception e){
            System.err.println("producer has exception:");
            e.printStackTrace();

        }
    }
}
