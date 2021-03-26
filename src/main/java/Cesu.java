import java.nio.charset.Charset;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by 昊淼 on 6/17/16.
 * cesu-8, utf-8 编码
 */
public class Cesu {

    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private static String convertToUTF8(String str) {
        byte[] byteArray = str.getBytes(UTF_8);
        return new String(byteArray, UTF_8);
    }

    private static  String convertToUTF8(int hexString) {
        char[] emojiCharArray = Character.toChars(hexString);
        return new String(emojiCharArray);
    }

    public static void main(String[] args) {
        boolean b = Character.isSurrogate('\uAAAA');
        boolean b1 = Character.isHighSurrogate('\uAAAA');
        boolean b2 = Character.isLowSurrogate('\uAAAA');
        System.out.println(b);

        String s = convertToUTF8("😭");

        System.out.printf(s);

    }

}
