package Pattern;
import java.util.Scanner;
public class StarPrin {
    public static void main(String[] args){

        int input1;
        Scanner sc=new Scanner(System.in);
        input1=sc.nextInt();
        for(int i=1; i<=input1;i++){

            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
