package array;

import java.util.Scanner;
import java.util.Arrays;

public class equlaAfterRotate {
    public static String convert(int[] arr) {
        int[] temp = arr.clone();
        int len = temp.length;
        Arrays.sort(temp);
        if (Arrays.equals(temp, arr)) {
            return "yes";
        }
        int start = 0;
        int end = len - 1;
        while (start < len && arr[start] == temp[start]) {
            start++;
        }
        while (end >= 0 && arr[end] == temp[end]) {

            end--;
        }

        System.out.println(start);
        System.out.println(end);
        reverse(arr, start, end);
        if (Arrays.equals(arr, temp)) {
            return "Yes";
        }

        return "no";

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 5, 4 ,3};
        System.out.println(convert(nums));
    }
}
