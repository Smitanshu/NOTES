package Practice;

import java.util.ArrayList;
import java.util.List;

public class CountDigit {

public  static void count(ArrayList<Integer>arr, int element ){
    int count=0;
    for(int i:arr){

        if(element==i){
            count++;
        }

    }
    System.out.println("Count of "+element+": "+count);
}


    public static void main(String[] args){
        ArrayList<Integer>nums=new ArrayList<>(List.of(1,2,3,4,5 ,2,3,4,5,2,3,4,43,2,2,2,2,2));
        System.out.println(nums);
        count(nums, 2);


    }
}
