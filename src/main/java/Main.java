import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String s = "filter=cover%E6%95%B0%E9%87%8F=10ids=1%2C2%2C3";
        System.out.println(s);

        String s1 = "%E6%95%B0%E9%87%8F=10&filter=cover&ids=1%2C2%2C3&";
        System.out.println(s1.replaceFirst("&$", ""));
        System.out.println(s1);

        Long l = 1234567l;

        String s2 = String.valueOf(l); // Long to String

        System.out.println(s2);

        byte[] bytes = new byte[4];
        // Java int to byte
        bytes[0] = (byte) 192; // c0
        bytes[1] = (byte) 182; // b6
        bytes[2] = (byte) 204; // cc
        bytes[3] = (byte) 236; // ec

        String s3 = new String(bytes);

        System.out.println(s3);


        Long number = -123456L;

        System.out.println(number);

        String dayStr = "20170308";

        String humanDay = dayStr.substring(0,4) + "年" + dayStr.substring(4,6) + "月" + dayStr.substring(6,8) + "日";

        System.out.println(humanDay);


        int year = Integer.valueOf(String.valueOf(dayStr).substring(0,4));
        int month = Integer.valueOf(String.valueOf(dayStr).substring(4,6));
        int dday = Integer.valueOf(String.valueOf(dayStr).substring(6,8));

        Date d = new Date(year - 1900, month - 1, dday);
        Long timestamp = d.getTime() / 1000;

        System.out.println(year);
        System.out.println(month);
        System.out.println(dday);

        System.out.println(timestamp);

        Map<String, Float> tagMaps = new HashMap<>();

        Arrays.stream("猫#0.1,动物#0.6".split(",")).forEach((t_c) -> {
            String[] tc = t_c.split("#");
            String t = tc[0];
            Float c = Float.valueOf(tc[1]);

            tagMaps.put(t, c);
        });

        System.out.println(tagMaps);

        // 5497558138880
        Long maxNubiaSize = 1024L * 1024 * 1024 * 1024 * 5;
        // 0, 第一个 1024 是 int, 1024 * 1024 * 1024 * 1024 超过 int 了。
        Long maxNubiaSize1 = 1024 * 1024 * 1024 * 1024 * 5L;

        System.out.println(maxNubiaSize);

        Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1490255594L * 1000L);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        long takenOn = calendar.getTimeInMillis() / 1000;

        System.out.println(takenOn);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        date.setTime(takenOn * 1000);
        String name = sdf.format(date);

        System.out.println(name);

        if ((byte) 1 == (byte) 1) {
            System.out.println(">>>>>>>>>>>>>>>>>> true");
        }
    }

}
