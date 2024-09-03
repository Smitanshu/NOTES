package Practice;

import java.util.ArrayList;
import java.util.List;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(10);
        nums.add(23);
        nums.add(30);
        nums.add(40);
        nums.add(45);
        nums.add("Smitanshu");
        System.out.println(nums);
        Pair<String, Integer> p1 = new Pair("Smitanshu", 36);

        p1.getDescription();


        ArrayList<String>num2=new ArrayList<>();
        num2.add("Smitanshu");
        num2.add("Devendra");
        num2.add("Ukey");
        System.out.println(num2);

        List<Integer>nums3=new ArrayList<>();
        nums3.add(123);
        nums3.add(321);
        System.out.println(nums3);
    }
}
