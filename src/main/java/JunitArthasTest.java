import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 昊淼 on 10/27/16.
 */
public class JunitArthasTest {

    @Test
    public void testArthas() {
        try {
            for (int i=0; i<10; i=i++) {

            }
        } catch (Exception e) {
            Assert.fail();
        }
    }

}
