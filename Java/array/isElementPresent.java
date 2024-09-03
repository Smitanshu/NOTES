package array;

import java.util.Scanner;

public class isElementPresent {
    public static String search(int[] numb, int num) {
        for (int j : numb) {
            if (j == num) {
                return "Yes Present";
            }
        }
        return "Not present";

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7};
        Scanner in = new Scanner(System.in);


        System.out.print("Enter number to search :");
        int input1 = in.nextInt();

        String ans = search(arr, input1);
        System.out.println(ans);


    }
}
