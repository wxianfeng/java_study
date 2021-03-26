/**
 * Created by haomiao on 11/16/16.
 */
public class Init {
    private static boolean sIsInit;
    private boolean isInit;

    public Init() {
        init();
    }

    private void init() {
        if (!isInit) {
            System.out.println("init");
        }

        if (!sIsInit) {
            System.out.println("sinit");
        }

        isInit = true;
        sIsInit = true;
    }

    private static void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Init init1 = new Init();
        // Notice: Java 里实例变量可以调用静态方法, Ruby 里不行
        init1.hello();

        Init init2 = new Init();
    }
}
