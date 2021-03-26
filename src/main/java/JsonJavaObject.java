import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by haomiao on 12/19/16.
 */
public class JsonJavaObject {

    public static void main(String[] args) {
        String s = "{\"code\": -1006, \"message\": \"参数错误\"}";

        // com.wxianfeng.open.json string 转 Java Object
        Resp resp = JSON.parseObject(s, Resp.class);

        System.out.println(resp.getCode());
        System.out.println(resp.getMessage());

        // System.out.println(String.valueOf(null)); // java.lang.NullPointerException

        Map<String, String> headers = new HashMap();
        headers.put("a", null);
        headers.put("b", "");

        String s1 = "1";
        long l = Long.valueOf(s1);
        System.out.println(l);

        Integer i = 5;
        String s2 = String.valueOf(i);
        System.out.println(s2);

        System.out.println(i.toString());
        System.out.println(String.valueOf(3));
    }
}
