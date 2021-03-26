import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 昊淼 on 9/8/16.
 */
public class ListStudy {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>(Arrays.asList(123L, 456L));
        List<Long> list1 = new ArrayList<>();
        list1.add(123L);
        list1.add(456L);

        List<Long> list2 = new ArrayList<>();
        list2.addAll(list);

        list.removeAll(list1);

        System.out.println(String.valueOf(list.size())); // 0
        System.out.println(String.valueOf(list2.size())); // 2

    }

}
