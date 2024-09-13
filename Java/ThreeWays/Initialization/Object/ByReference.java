package ThreeWays.Initialization.Object;

class Byrefernce {
    int id;
    String name;
}

public class ByReference {
    public static void main(String[] args) {
        Byrefernce obj1 = new Byrefernce();
        obj1.id = 36;
        obj1.name = "Smitanshu";
        System.out.println(obj1.id + " " + obj1.name);
    }
}
