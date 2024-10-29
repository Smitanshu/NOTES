package Numbers;

import java.util.Scanner;

public class DeArrangement {

    public static long count(int n) {


        if (n == 0) return 1;

        if (n == 1) return 0;
        long prev1 = 0;
        long prev2 = 1;
        long sum = 0;
        for (int i = 2; i <= n; i++) {

            sum = (i - 1) * (prev1 + prev2);
           sum=sum%1000000007;
            prev2=prev1;
            prev1=sum;
        }


        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n=sc.nextInt();
        long result=count(n);
        System.out.println(result);

    }
}
