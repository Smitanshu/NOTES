package Numbers;
import java.util.Scanner;
public class LeadingZero {
    public static String reverse(String num) {
        String reverse = new StringBuilder(num).reverse().toString();
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        System.out.println((reverse(input1)));

    }
}
