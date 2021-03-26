/**
 * Created by haomiao on 2017/08/11.
 */
public class Duration {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();

        long escape = System.currentTimeMillis() - t;

        System.out.println(escape);
    }
}
