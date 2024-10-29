package com.Striver.Sheet.Array;
import java.util.Arrays;

public class LargestElement {
    //Time complexity:O(n);
    public static int Optimal(int[] arr) {
        int element = arr[0];
        for (int num : arr) {
            if (num > element) element = num;
        }
        return element;
    }

    //Time compexity:O(nLog(n)).
    public static int Brute(int[] arr) {
        Arrays.sort(arr);
        int element = arr[arr.length - 1];
        return element;
    }

    public static void main(String[] args) {
        int[] arr = {1, 324, 556, 32, 778, 45, 7, 44, 8562, 3, 734, 776, 56, 545};
        System.out.println("Optimal :" + Optimal(arr) + "\n" + "Brute :" + Brute(arr));

    }
}
