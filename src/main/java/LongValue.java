import java.net.URLEncoder;
import java.util.UUID;

/**
 * Created by haomiao on 2017/07/25.
 */
public class LongValue {
    public static void main(String[] args) throws Exception {
        System.out.println("Read timed out".indexOf("timed out"));

        String s = "/apps/nubia_cloud/我的文件/0016004036.id|/apps/nubia_cloud/我的文件/复制效果.txt";
        System.out.println(URLEncoder.encode(s, "UTF-8"));

        System.out.println(UUID.randomUUID());
    }
}
