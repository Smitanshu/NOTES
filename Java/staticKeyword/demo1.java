package staticKeyword;

class accenture {
    int empId;
    int salary;
    static String ceo;

    public void print() {
        System.out.println(empId + " " + salary + " " + ceo);
    }
}

public class demo1 {
    public static void main(String[] args) {

        accenture obj = new accenture();
        obj.ceo = "abc";
        accenture.ceo = "Julie Sweet";
        obj.print();
    }
}