import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Th extends Thread{
    public void run(){
        try {
            for(int i=0;i<10;i++)
            {
                if(i%2==0)
                System.out.println(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Th thread1=new Th();
        thread1.start();
    }
}
