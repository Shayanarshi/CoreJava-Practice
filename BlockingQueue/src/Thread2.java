import java.util.concurrent.ArrayBlockingQueue;

public class Thread2 extends Thread{
    ArrayBlockingQueue<Integer> abq;
    public Thread2(ArrayBlockingQueue<Integer> abq)

    {
        this.abq = abq;
    }
        public void run()
    {
        try{
            for (int i =1 ; i<=2;i++){
                System.out.println("Elements removed from the blocking queue :"+ abq.take());
                Thread2.sleep(5000);
            }
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    }
