package ThreeWays.Initialization.Object;
class bymethod{
    int id;
    String name;
    void insert(int id, String name){
        this.id=id;
        this.name=name;
    }
   void print(){
       System.out.println(id+ " "+name);

   }
}

public class Method {


    public static void main(String[] args){

        bymethod obj1=new bymethod();
        obj1.insert(36, "Smitanshu ");
   obj1.print();

    }
}
