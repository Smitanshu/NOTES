package array;

import java.util.Arrays;
import java.util.Scanner;

public class returnArrrayTargetSum {

    public static int[] twoSum(int[] num, int target) {

        int[] arr = new int[2];
        int i = 0;
        int j = 0;
        for (i = 0; i < num.length; i++) {
            int sum = num[i];
            if(sum==target){
                j=i;
                break;
            }
            for (j = i + 1; j < num.length; j++) {
                sum += num[j];
                if (sum == target) {

                    break;
                }
            }
            if (sum == target) {
                break;
            }
        }
        arr[0] = i;

        arr[1] = j;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
      int []result=twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
