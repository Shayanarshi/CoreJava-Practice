import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 1; i <=12 ; i++) {
            int x = i;

            service.submit( ()->{
                System.out.println(x+ " ----> "+ Thread.currentThread().getName());
            });
        }
        service.shutdown();  // don't forget to add this line
    }
}
