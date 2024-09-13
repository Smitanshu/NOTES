package Practice;

import java.util.Scanner;

public class LeapYear {
    public static String isLeap(int num) {

        if((num%4==0 && num%100!=0) || num%400==0) {
            return "Leap year";
        }
        return "Not Leap Year";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1;
        input1 = sc.nextInt();

        System.out.println(isLeap(input1));
    }
}
