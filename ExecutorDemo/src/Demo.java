import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class  Counter{
    int count =0;
    public synchronized void increment(){
        count++;
    }
}
public class Demo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 1; i <=2 ; i++) {
            service.submit( ()-> counter.increment());
        }

        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){}

        System.out.println(counter.count);
        service.shutdown();
    }
}
