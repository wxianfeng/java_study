import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by haomiao on 12/23/16.
 *
 * https://docs.oracle.com/javase/7/docs/api/  => URLEncoder
 *
 *
 */
public class UrlEncoder {
    // ! *'();:@&=+$,/?#[]
    public static void main(String[] args) throws Exception {
        // " " => +
        // ! => %21
        // ' => %27
        // ( => %28
        // ) => %29
        // ; => %3B
        // : => %3A
        // @ => %40
        // & => %26
        // = => %3D
        // + => %2B
        // $ => %24
        // , => %2C
        // / => %2F
        // ? => %3F
        // # => %23
        // [ => %5B
        // ] => %5D
        // ~ => %7E

        // "& !'();:@=+$,/?#[]~-*_.测试.pdf"
        String escapeV = URLEncoder.encode(String.valueOf(" !'();:@&=+$,/?#[]~"), "UTF-8"); // 空格变成 +

        String unescapeV = URLEncoder.encode(String.valueOf("-*_."), "UTF-8");

        String escapehan = URLEncoder.encode(String.valueOf("测试"), "UTF-8");

        System.out.println(escapeV);
        System.out.println(unescapeV);
        System.out.println(escapehan);

        // "& !'();:@=+$,/?#[]~-*_.测试.pdf"
        String s = "%26+!'()%3B%3A%40%3D%2B%24%2C%2F%3F%23%5B%5D~-*_.%E6%B5%8B%E8%AF%95.pdf";
        String decodeS = URLDecoder.decode(s, "UTF-8");

        System.out.println(decodeS);

    }
}
