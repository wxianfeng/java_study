/**
 * @author haomiao.wxf
 * @date 2021/02/22 7:49 PM
 */
public class DingThread extends Thread {
    // 次数
    private int count = 1;
    // 锁对象
    // private Object lock = new Object();
    private final byte[] lock = new byte[0];

    @Override
    public void run() {
        while (true) {
            // 同步锁
            synchronized (lock) {
                // 唤醒线程
                lock.notify();
                if (count <= 100) {
                    System.out.println(Thread.currentThread().toString() + ": " + count);
                    count++;

                    try {
                        // 线程等待
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
