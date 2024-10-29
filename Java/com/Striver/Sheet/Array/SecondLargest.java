package com.Striver.Sheet.Array;

import java.util.Arrays;
import java.util.ArrayList;

public class SecondLargest {
    //Time Complexity=O(nlogn +n);
    public static ArrayList<Integer> Brute(int[] arr) {
        ArrayList<Integer> Large = new ArrayList<>();
        Arrays.sort(arr);

        int element = -1;
        for (int i = arr.length - 1; i >= 0; i--) {

            if (element < arr[i] && arr[i] != arr[arr.length - 1]) {
                element = arr[i];
            }
        }
        Large.add(element);
        Large.add(arr[arr.length - 1]);

        return Large;
    }


    //Time Complexity :O(n+n)=>>>>>{O(2n)}
    public static ArrayList<Integer> Better(int[] arr) {
        ArrayList<Integer> Large = new ArrayList<>();
        int largest = 0;
        int slargest = -1;
        for (int num : arr) {

            if (num > largest) {
                largest = num;
            }
        }
        for (int num : arr) {
            if (num > slargest && num != largest) {

                slargest = num;
            }
        }
        Large.add(slargest);
        Large.add(largest);
        return Large;
    }


    //Time Complexity :o(n);
    public static ArrayList<Integer> Optimal(int[] arr) {
        ArrayList<Integer> Large = new ArrayList<>();
        int largest = arr[0];
        int slargest = -1;
        for (int num : arr) {

            if (num > largest) {
                slargest = largest;
                largest = num;
            } else if (num < largest && num > slargest) {
                slargest = num;
            }
        }

        Large.add(slargest);
        Large.add(largest);

        return Large;
    }

    public static void main(String[] args) {
        int[] arr = {11, 11, 1, 1, 2, 2, 2, 3, 3, 3, 3,};
        System.out.println(Brute(arr) + " "
                + Better(arr) + " "
                + Optimal(arr)
        );
    }
}
