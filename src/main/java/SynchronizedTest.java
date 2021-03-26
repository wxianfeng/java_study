/**
 * Created by haomiao on 3/17/17.
 *
 * @author haomiao
 * @date 2017/03/17
 */
public class SynchronizedTest {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new MyThread();
            thread.start();
        }

    }
}
