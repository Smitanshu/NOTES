package OOP;
class Parent2 {

    void display() {

        System.out.println("Inside Parent");
    }

}

class Child extends Parent2 {
   @Override
    void display() {
       super.display();
        System.out.println("Inside child");
    }
}

public class Parent {

    void display() {
        System.out.println("Inside Parent");
    }

    public static void main(String[] args) {
        Child obj1=new Child();
        obj1.display();

        Parent2 obj2=new Parent2();
        obj2.display();

        Parent2 obj3=new Child();
        obj3.display();


    }
}

