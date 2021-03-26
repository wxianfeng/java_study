import java.io.*;

/**
 * Created by 昊淼 on 6/19/16.
 */
public class ReadEmoji {

    public static void main(String[] args) {
        File file = new File("/data/java_projects/java_study/src/emoji.out");
        InputStream in = null;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            in = new FileInputStream(file);
            // 一次读一个字节
//            int tempbyte;
//            while ((tempbyte = in.read()) != -1) {
//                os.write(tempbyte);
//            }

            // 一次读 1024 个 byte
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            byte[] arr = os.toByteArray();
            String s = new String(arr, "UTF-16");
            System.out.println(s);

            in.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
