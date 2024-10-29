package ExceptionHandling;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int[] arr = new int[5];


        try {
            System.out.println("Hello i am learning Exception");
            try {

                int result = 10 / 0;
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
