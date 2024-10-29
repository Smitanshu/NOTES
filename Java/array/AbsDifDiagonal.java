package array;

import java.util.*;

public class AbsDifDiagonal {
    static void print(int[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        print(arr);

        int first = 0;
        int second = 0;

        int i = 0, j = 0;

        while (i < arr[0].length && j < arr[0].length) {
            first += arr[i][j];
            i++;
            j++;
        }
        System.out.println(first);
        i = 0;
        j = arr[0].length - 1;

        while (i < arr[0].length && j >= 0) {
            second += arr[i][j];

            i++;
            j--;
        }
        System.out.println(second);

        int Dif = Math.abs(first - second);
        System.out.println("Difference : " + Dif);
    }
}
