package Practice;
import javax.xml.transform.stream.StreamSource;
class usingRunnable  implements Runnable{
    public void run(){

        try{
            for(int i=0; i<5; i++){
                System.out.println("Thread Name"+ Thread.currentThread().getName() + i);
                Thread.sleep(1000);

            }
        }catch(InterruptedException e){
            System.out.println(e);

        }
    }
}
public class ThreadRunnable{
    public static void main(String[] args){

        usingRunnable thread=new usingRunnable();
        Thread t1=new Thread(thread, "One ");
        Thread t2=new Thread(thread, "two");

        t1.start();
        t2.start();
        

    }
}