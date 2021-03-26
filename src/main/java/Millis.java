/**
 * Created by haomiao on 2/16/17.
 */
public class Millis {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            long t2 = System.currentTimeMillis();

            long cost = t2 - t1;
            System.out.printf("t2:" + cost + "\n");
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            long t3 = System.currentTimeMillis();

            long cost = t3 - t1;
            System.out.printf("t3:" + cost + "");
        }

    }
}
