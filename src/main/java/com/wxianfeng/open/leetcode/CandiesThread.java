package com.wxianfeng.open.leetcode;

/**
 * @author haomiao.wxf
 * @date 2021/02/20 5:45 PM
 */
public class CandiesThread extends Thread {
    private int[] candines;
    private int element;
    private int elementIdx;
    private int extraCandines;

    public CandiesThread(int[] candines, int element, int elementIdx, int extraCandines) {
        this.candines = candines;
        this.element = element;
        this.elementIdx = elementIdx;
        this.extraCandines = extraCandines;
    }

    @Override
    public void run() {
        boolean flag = true;
        for (int i = 0; i < candines.length; i++) {
            if (this.elementIdx == i) {
                continue;
            }

            if (this.candines[i] + this.extraCandines <= this.element) {
                flag = false;
            }
        }

        System.out.println(this.elementIdx + " " + flag);
    }
}
