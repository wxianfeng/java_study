package com.wxianfeng.open.leetcode.dingcode.four;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/09/03 1:59 PM
 */

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 业务平台组织100人的爬山活动，山高400米
 * 每个人每爬1米消耗一个能量
 * 在半山腰100米、200米、300迷处各设有一个补给站
 * 最终对爬上山的前十名进行颁奖
 *
 * 题1：请从程序功能的角度，列举出下列代码中存在哪几处功能性错误（需要准确说出存在几处错误，分别是什么问题）
 * 题2：请从代码设计的角度，说出你认为以下代码有哪些不合理的设计，并提出优化方案
 */
public class Problem {

    private static final int TOTAL_MOUNTAIN_HEIGHT = 400;

    /**
     * 参与爬山活动的总人数
     */
    private static final int TOTAL_CLIMBER_NUM = 100;

    /**
     * 每人最多100能量
     */
    private static final int MAX_ENERGE = 100;

    private static final Random RANDOM = new Random();

    /**
     * 线程池
     */
    private static final ExecutorService THREAD_POOL =
            new ThreadPoolExecutor(TOTAL_CLIMBER_NUM, TOTAL_CLIMBER_NUM, 5, TimeUnit.MICROSECONDS,
                    new ArrayBlockingQueue<>(1), new ThreadPoolExecutor.DiscardPolicy());

    /**
     * 记录登顶情况
     */
    private static final Map<Integer, Integer> RESULT = new ConcurrentHashMap<>(TOTAL_CLIMBER_NUM);

    /**
     * 100米设置一个补给点
     */
    private static final SupplyStation FIRST_STATION = new SupplyStation(100, 4000);

    /**
     * 200米设置一个补给点
     */
    private static final SupplyStation SECOND_STATION = new SupplyStation(200, 3000);

    /**
     * 300米设置一个补给点
     */
    private static final SupplyStation THIRD_STATION = new SupplyStation(300, 2000);

    /**
     * 记录当前已到达山顶的排名
     */
    private static volatile Integer rank = 0;

    /**
     * 爬山者
     */
    private static class Climber implements Runnable {

        /**
         * 爬山者编号
         */
        private final Integer id;

        /**
         * 记录当前爬的高度
         */
        private Integer height = 0;

        /**
         * 记录剩余能量
         */
        private Integer energy;

        public Climber(Integer id, Integer energe) {
            this.id = id;
            this.energy = energe;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    {
                        height++;
                        energy--;   // 每上升一步，能量减一
                        Thread.sleep(RANDOM.nextInt(10) * 10);  // 每个人爬的快慢不一
                        if (energy <= 0) {
                            break;  // 能量用完，退出比赛
                        }
                    }
                    if (height == FIRST_STATION.getHeight()) {
                        // 100米补充能量
                        if (FIRST_STATION.getEnergy() > 0) {
                            energy = accessEnergy(FIRST_STATION, energy);
                        }
                        // 补充完之后休息一下
                        Thread.sleep(RANDOM.nextInt(10) * 1000);
                    }
                    if (height == SECOND_STATION.getHeight()) {
                        // 200米补充能量
                        if (SECOND_STATION.getEnergy() > 0) {
                            energy = accessEnergy(SECOND_STATION, energy);
                        }
                        // 补充完之后休息一下
                        Thread.sleep(RANDOM.nextInt(10) * 1000);
                    }
                    if (height == THIRD_STATION.getHeight()) {
                        // 300米补充能量
                        if (THIRD_STATION.getEnergy() > 0) {
                            energy = accessEnergy(THIRD_STATION, energy);
                        }
                        // 补充完之后休息一下
                        Thread.sleep(RANDOM.nextInt(10) * 1000);
                    }
                    if (height == TOTAL_MOUNTAIN_HEIGHT) {
                        // 到达终点
                        synchronized (rank) {
                            rank++;
                            System.out.println(id + "到达山顶的名次" + rank);
                            RESULT.put(rank, id);
                            break;
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }

        private synchronized Integer accessEnergy(SupplyStation station, Integer currentEnerge) {
            Integer supply = MAX_ENERGE - currentEnerge;
            if (station.getEnergy() < supply) {
                // 剩余能量不足
                supply = station.getEnergy();
            }
            station.setEnerge(station.getEnergy() - supply);
            return currentEnerge + supply;
        }
    }

    private static class SupplyStation {

        private final Integer height;

        private Integer energy;

        public SupplyStation(Integer height, Integer energy) {
            this.height = height;
            this.energy = energy;
        }

        public Integer getHeight() {
            return height;
        }

        public synchronized Integer getEnergy() {
            return energy;
        }

        public synchronized void setEnerge(Integer energy) {
            this.energy = energy;
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_CLIMBER_NUM; i++) {
            // 依次扔进线程池中
            THREAD_POOL.submit(new Climber(i, RANDOM.nextInt(200)));
        }
        while (true) {
            if (RESULT.size() >= 10) {
                // 开始颁奖
                break;
            }
        }
    }

}
