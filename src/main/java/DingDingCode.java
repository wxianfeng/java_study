/**
 * @author haomiao.wxf
 * @date 2021/02/22 7:49 PM
 *
 * 请实现两个线程，使之交替打印1 - 100，如：两个线程分别为：Printer1和Printer2，最后输出结果为：
 * Printer1 — 1
 * Printer2 — 2
 * Printer1 — 3
 * Printer2 — 4
 */
public class DingDingCode {
    public static void main(String[] args) {
        DingThread dingThread = new DingThread();
        new Thread(dingThread).start();
        new Thread(dingThread).start();
    }
}
