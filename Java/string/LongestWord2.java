package string;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class LongestWord2 {
    public static String longWord(String input1) {

        String[] arr = input1.split(" ");

        String ans = " ";
        for(String x:arr){
            if(x.length()>ans.length()){
                ans=x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1;
        input1 = sc.nextLine();
        System.out.println(longWord(input1));
    }
}


