/**
 * Created by haomiao on 3/17/17.
 *
 * @author haomiao
 * @date 2017/03/17
 */
public class Sync {
    private static byte[] lock = new byte[0];

    public void hello() {
        System.out.println("hello");
        try {
            // 锁住同一个对象
            // or synchronized (Sync.class)
            synchronized (lock) {
                System.out.println("start");
                Thread.sleep(2000);
                System.out.println("stop");
            }
        } catch (Exception e) {
        }

    }

}
