package string;
import java.util.Scanner;
public class stone {

    public static void color(String str1, String str2){

        int pos=0;
        for(int i=0; i<str2.length();i++){

            if(str1.charAt(i)==str2.charAt(pos)){
                pos++;
            }
            if(pos== str1.length()){
                break;
            }
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();





    }
}
