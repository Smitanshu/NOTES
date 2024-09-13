package Numbers;

import java.util.Scanner;

public class EvenSum {

    public static int sum(String num) {

        String[] arr = num.split(" ");
        int sum = 0;
        for (String i : arr) {
            int temp = Integer.parseInt(i);
            if (temp % 2 == 0) {
                sum += temp;

            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String input1;
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextLine();
        System.out.println((sum(input1)));

    }
}
