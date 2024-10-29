package string;

import java.util.Arrays;
import java.util.Scanner;
public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        System.out.println("Enter the target character:");
        char target = sc.next().charAt(0);

        // Call method to replace most frequent character with target
        String result = replaceMostFrequentChar(input, target);
        System.out.println(result);
    }

    public static String replaceMostFrequentChar(String str, char target) {
        if (str == null || str.isEmpty()) {
            return str; // Return input if it's empty or null
        }

        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        int maxFreq = 0;
        char mostFrequentChar = str.charAt(0);

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequentChar = (char) (i + 'a');
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == mostFrequentChar) {
                result.append(target);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
