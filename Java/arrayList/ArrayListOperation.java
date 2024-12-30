package arrayList;

import java.util.ArrayList;
import java.util.List;
public class ArrayListOperation {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();


        names.add("sskkssk");
        names.add("Abcde");
        names.add("wdjwd");
        names.add("qjkqwdqjdod");

        names.forEach(name-> System.out.println(name));

    }
}