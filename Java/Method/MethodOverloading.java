package Method;

public class MethodOverloading {
    public static void main(String[] args) {
        addition(12, 34);
        addition(2.0, 4.0);
        print(123321);
        print("Smitanshu");

    }

    public static void addition(int a, int b) {
        System.out.println(a + b);
    }

    public static void addition(double a, double b) {
        System.out.println(a + b);
    }

    public static void print(int n) {
        System.out.println(n);
    }

    public static void print(String name) {
        System.out.println(name);
    }

}
