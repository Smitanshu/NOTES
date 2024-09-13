package string;
import java.util.Scanner;
public class lowerUpper {
    public static String convert(String str) {
        String ans = str;
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(ans.charAt(i))) {
                upperCount++;

            } else {
                lowerCount++;

            }
        }
        if (upperCount > lowerCount) {
            return ans.toUpperCase();
        }

        return ans.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convert(str));
    }
}