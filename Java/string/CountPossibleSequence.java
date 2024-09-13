package string;

import java.util.Scanner;

public class CountPossibleSequence {
    public static int count(String str) {
        int[] nums = new int[26];
        for (char c : str.toCharArray()) {
            nums[c - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (nums[i] < min && nums[i] > 0) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(count(input));
        sc.close();
    }
}
