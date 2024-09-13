package string;

import java.util.Scanner;
import java.lang.*;
public class CountInt {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0; i<str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
