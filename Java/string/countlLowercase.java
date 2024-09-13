package string;
import java.util.Scanner;
public class countlLowercase {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        int lowerCount=0;
        int upperCount=0;
        int numberCount=0;
        String input1=sc.nextLine();
        for(int i=0; i<input1.length();i++){

            if(Character.isLowerCase(input1.charAt(i))){
                lowerCount++;
            }
            if(Character.isUpperCase(input1.charAt(i))){
                upperCount++;
            }
            if(Character.isDigit(input1.charAt(i))){
                numberCount++;
            }
        }
        System.out.println("LowerCount  :"+lowerCount);
        System.out.println("UpperCount  :"+upperCount);
        System.out.println("NumberCount :"+numberCount);
    }
}
