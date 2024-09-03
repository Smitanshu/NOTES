package Method;

public class shadowing {

    static int x = 111;
    int instance_var = 222;


    public static void main(String[] args) {
        int x = 10;
        System.out.print("Static/clas/Global Variable :" + shadowing.x);
       //scope will begin when value is intialized.

        System.out.println("\n" + x);
        temp();


    }


    public static void temp() {
        System.out.print(x);

        // System.out.println(instance_var);
    }
}
