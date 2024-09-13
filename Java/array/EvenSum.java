package array;
import java.util.Scanner;
public class EvenSum {
    public static int sum(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            int temp = num[i];

            if (temp % 2 == 0) {
                sum += num[i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(sum(arr));
    }
}
