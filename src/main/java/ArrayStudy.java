import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * Created by 昊淼 on 8/23/16.
 *
 * http://blog.csdn.net/dm_vincent/article/details/40503685
 * http://blog.csdn.net/zhang89xiao/article/details/51916405
 * 
 */
public class ArrayStudy {

    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name", "a");
        jsonObject1.put("value", 1);

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name", "b");
        jsonObject2.put("value", 2);

        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);

        String match = null;
        for (Object jsonObject: jsonArray) {
            JSONObject jsonObject3 = (JSONObject) jsonObject;
            if (jsonObject3.getString("name") == "a") {
                match = jsonObject3.getString("value");
            }
        }

        System.out.printf(match);


        List<Map> listStudy = new ArrayList();
        Map map1 = new HashMap();
        map1.put("name", "aa");
        map1.put("value", 11);

        listStudy.add(map1);

        Map map2 = new HashMap();
        map2.put("name", "bb");
        map2.put("value", 22);

        listStudy.add(map2);

        Map map = listStudy.stream().findFirst().get();


//        ListStudy<String> names = Arrays.asList("Brad", "Kate", "Kim", "Jack", "Joe", "Mike", "Susan", "George", "Robert", "Julia", "Parker", "Benson");
//
//        final String firstNameWith3Letters = names.com.wxianfeng.open.stream()
//                .filter(name -> length(name) == 3)
//                .map(name -> toUpper(name))
//                .findFirst()
//                .get();
//
//        System.out.println(firstNameWith3Letters);
    }

}
