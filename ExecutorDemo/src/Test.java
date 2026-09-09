import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws Exception {
        /*Runnable runnable = () -> {
            int x = 10 + 20;
            System.out.println(x);
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(runnable);
        service.shutdown();
         */

        Callable<Integer> callable = () -> {
            return 10 + 20;
        };

        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<Integer> future = service.submit(callable);

        int result = future.get();
        System.out.println(result);

        service.shutdown();

    }
}
