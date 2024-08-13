package Practice;
import java.util.ArrayList;
import java.util.Scanner;
public class IntegerToBinary {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer number :");
        int input1=sc.nextInt();
        System.out.println("Using Array[] :");
        int num=input1;
        ArrayList<Integer>arr=new ArrayList<>();

        while(num!=0){

            int bit=num%2;
            arr.add(bit);
            num=num/2;

        }
        for(int i=arr.size()-1;i>=0; i--){
            System.out.print(arr.get(i));
        }
   System.out.println();

        System.out.println("Using Inbuilt Method :");
        System.out.println((Integer.toString(input1,2)));
        System.out.println("Using Bitwise operator :");
        num=input1;
        for(int i=31;i>=0;i--){
            int bit=num>>i;
            if((bit&1)>0){
                System.out.print("1");

            }
            else{
                System.out.print("0");
            }
        }
   sc.close();
    }
}
