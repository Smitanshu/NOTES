package array;

import java.util.Arrays;

public class SubarrayReversal {

    // Function to check if reversing a subarray makes the array sorted
    public static String canBeSorted(int[] arr) {
        int n = arr.length;

        // Create a copy of the array and sort it to compare later
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // If the original array is already sorted, return "Yes"
        if (Arrays.equals(arr, sortedArr)) {
            return "Yes";
        }

        // Find the first and last index where arr differs from sortedArr
        int start = 0, end = n - 1;
        while (start < n && arr[start] == sortedArr[start]) {
            start++;
        }
        while (end >= 0 && arr[end] == sortedArr[end]) {
            end--;
        }

        // Reverse the subarray between start and end
        reverse(arr, start, end);

        // Check if reversing the subarray made the array sorted
        if (Arrays.equals(arr, sortedArr)) {
            return "Yes";
        }

        return "No";
    }

    // Helper function to reverse a subarray
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 3};
        int[] arr2 = {1, 2, 4, 5, 3};

        System.out.println(canBeSorted(arr1)); // Output: Yes
        System.out.println(canBeSorted(arr2)); // Output: No
    }
}
