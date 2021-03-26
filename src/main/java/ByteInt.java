import java.math.BigInteger;

/**
 * Created by haomiao on 12/1/16.
 */
public class ByteInt {

    public static void main(String[] args) {
        int i = 444;
        System.out.println((byte) i);
//        "0".getBytes();

        byte[] bs = "abcsssaaaaxxsdsdasdadwasdascssdffdlklkfisdiiaskhasjkdhjkashfaydabsbdagsdjad".getBytes();

        BigInteger bigInteger = new BigInteger(1, bs);

        System.out.println(bigInteger.toString(16));
    }

}
