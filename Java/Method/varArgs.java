package Method;
import java.util.Arrays;
public class varArgs {
    public static void main(String[] args) {
        fun(1, 2, 34, 5, 6, 57, 6, 868, 2);
        multiple(2, 4, "Smitanshu", "Ukey");
    }
    public static void fun(int... V) {
        System.out.println(Arrays.toString(V));
    }
    public static void multiple(int a, int b, String... v) {
        System.out.println(a + "  " + b + "  " + Arrays.toString(v));
    }

}
