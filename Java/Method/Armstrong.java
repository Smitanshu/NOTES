package Method;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        if (calculate(input1)) {
            System.out.println("It is armstrong ");
        } else {
            System.out.println("It is not armstrong");
        }
    }

    public static boolean calculate(int number) {


        int num = number;
        int sum = 0;
        while (num != 0) {
            int bit = num % 10;
            sum = sum + bit * bit * bit;
            num /= 10;
        }

        if (sum == number) {
            return true;
        }

        return false;

    }
}
