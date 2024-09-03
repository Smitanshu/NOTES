package Method;
import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        if (isPrime(input1)) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }

    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

}
