/**
 * Created by haomiao on 2017/06/13.
 */
public class SplitTest {
    public static void main(String[] args) {
        String s = "/a/b/c/d.txt";

        String[] names = s.split("/");

        for(String name: names) {
            // 最前面分隔出一个空格
            System.out.println(name);
        }


        String locationRes = "116.487585177952,39.991754014757;121.310743815105,31.203563910591";
        String[] locationsArr = locationRes.split(";");
        System.out.println(locationsArr.length);
        System.out.println(locationsArr[0].split(",")[0]);
        System.out.println(locationsArr[0].split(",")[1]);
    }
}

//
// a
// b
// c
// d.txt
