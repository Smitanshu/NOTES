package Practice;
//Change value in array
import java.util.Arrays;
public class ChangeValue {

    public static void main(String [] args){
        int []arr={10,20,30,40};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int []nums){

        nums[0]=30;

    }
}