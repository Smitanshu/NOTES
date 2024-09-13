package Numbers;
import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args){

        int input1;
        Scanner sc=new Scanner(System.in);
        input1=sc.nextInt();

        int temp=input1;
        int sum=0;
        while(temp>0){

            int bit=temp%10;
            sum=sum*10+bit;
            temp=temp/10;

        }
        System.out.println(sum);
    }
}
