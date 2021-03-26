/**
 * Created by haomiao on 3/17/17.
 *
 * @author haomiao
 * @date 2017/03/17
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run");
        Sync sync = new Sync();
        sync.hello();
    }
}
