package string;

import java.util.Arrays;
import java.util.Scanner;

public class LongestWord {

    public static String longWord(String input1) {

        String[] arr = input1.split(" ");
        int max = 0;
        String ans = " ";
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            int len = temp.length();
            if (max < len) {
                max = len;
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1;
        input1=sc.nextLine();
        System.out.println(longWord(input1));
    }
}
