package Practice;
import java.util.Scanner;
public class SwapTwoNum {

    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number:");
        int input1=sc.nextInt();
        System.out.print("Enter Second number :");
        int input2=sc.nextInt();


        int temp=input1;
        input1=input2;
        input2=temp;

        System.out.println("Input1: "+input1);
        System.out.println("Input2 :"+input2);

    }
}
