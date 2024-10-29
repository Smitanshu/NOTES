package Binary;
import java.util.Arrays;
public class searchTarget {


    public static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {


            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {

                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println(Arrays.toString(arr));

        return false;
    }

    public static void main(String[] args) {


        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arr[arr[arr[4]]]);
        System.out.println(search(arr, (int) 1.53823827848));
        System.out.println(Arrays.toString(arr));
    }

}