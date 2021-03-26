import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import static java.util.regex.Pattern.compile;

/**
 * Created by haomiao on 2017/12/28.
 */
public class PhotoNo {
    public static boolean isMobileNO(String mobile) {
        if(StringUtils.isNotEmpty(mobile)) {
            Pattern p = compile("^((13[0-9])|(15[^4,\\D])|(18[0,3,5-9])|(17[0-9]))\\d{8}$");
            Matcher m = p.matcher(mobile);
            return m.matches();
        }

        return false;
    }

    public static void main(String[] args) {
        String no = "18301109309";

        boolean b = isMobileNO(no);

        System.out.println(b);
    }
}
