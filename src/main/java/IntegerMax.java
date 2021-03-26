/**
 * Created by 昊淼 on 5/16/16.
 */
public class IntegerMax {

    /**
     *
     * Java Integer 默认是有符号的 最大值是 2 ** 31 - 1 即: 0x7fffffff
     * Ruby int 默认是无符号的 最大值是 2 ** 32 即: 0xFFFFFFFF
     * https://segmentfault.com/q/1010000000303613
     */
    public static void main(String[] args) {
        Integer i = 0xFFFFFFFF;
        System.out.println(i); // -1

        System.out.println(0x7fffffff); // 2147483647
        System.out.println(Integer.MAX_VALUE); // 2147483647
    }

}
