package array;
import java.util.Scanner;
public class TargetSum {


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int i=0;
        int j=0;
        for( i=0; i<n;i++){
            int sum=arr[i];
            for( j=i+1; j<n;j++){
                sum+=arr[j];
                if(sum==target){
                    break;
                }
            }
            if(sum==target){
                break;
            }
        }
        System.out.println(i+" "+ j);
    }
}
