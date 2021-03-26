//TODO: Java 里中文 和 emoji 得到的 bytes 为什么有负数?

/**
 * Created by 昊淼 on 6/19/16.
 */
public class Utf16 {

    public static void main(String[] args) {
        try {
            // String to byte
            String han = "我";
            byte[] h = han.getBytes("UTF-16"); // {-2, -1, 98, 17}  前面两个字节是表示 BE,LE, 默认是 BE, UTF-16 所以汉字是 2个字节, BMP 之内的字符
            System.out.println(h);

            String emoji = "😭";
            byte[] a = emoji.getBytes("UTF-16"); // { -2, -1, -40, 61, -34, 45 }
            System.out.println(a);
            System.out.println(emoji.length()); // 2

            byte[] b = emoji.getBytes("UTF-8"); // { -16, -97, -104, -83 }
            System.out.println(b);

            byte[] c = emoji.getBytes("CESU-8"); // { -19, -96, -67, -19, -72, -83 }
            System.out.println(c);

            // byte to String
            byte[] b1 = new byte[]{ -2, -1, -40, 61, -34, 45 }; // emoji bytes
            String b1_s = new String(b1, "UTF-16");
            System.out.println(b1_s);
        } catch (Exception e){

        }

    }

}
