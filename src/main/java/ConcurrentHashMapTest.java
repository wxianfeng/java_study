import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 昊淼 on 5/30/16.
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        Object VALUE = new Object();
        ConcurrentHashMap h = new ConcurrentHashMap();

        h.put("1", VALUE);

        boolean result = h.contains("1");
        boolean result1 = h.containsKey("1");

        System.out.println(result); // false
        System.out.println(result1); // true
    }
}
