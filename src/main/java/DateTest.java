import java.time.LocalDate;
import java.util.Date;

/**
 * Created by 昊淼 on 5/5/16.
 */
public class DateTest {

    public static void main(String[] args) {
        System.out.println("HI");

        LocalDate localDate = LocalDate.of(2015, 3, 2);
        System.out.println(localDate);

        Date test_createdAt = new Date(2000, 1, 1);//会被覆盖成当前时间
        System.out.println(test_createdAt);

        System.out.println("6741785229960944".hashCode());

        long t = new Date().getTime();
        System.out.println(t); // 1471854787675, 毫秒

        long t1 = System.currentTimeMillis();
        System.out.printf(String.valueOf(t1));
    }

}
