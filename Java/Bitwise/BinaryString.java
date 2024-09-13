package Bitwise;
import java.util.Scanner;
public class BinaryString {


    public static int convert(String str) {
        int result = str.charAt(0) - 'a';
        for (int i = 1; i < str.length(); i = i + 2) {

            char operator = str.charAt(i);
            int nextDigit = str.charAt(i + 1) - '0';
            if (operator == 'A') {
                result = result & nextDigit;
            } else if (operator == 'B') {
                result = result | nextDigit;
            } else if (operator == 'C') {
                result = result ^ nextDigit;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(convert(str));
    }
}
