import java.util.concurrent.ArrayBlockingQueue;

public class Thread1 extends Thread {
    ArrayBlockingQueue<Integer> abq;
    public Thread1(ArrayBlockingQueue<Integer> abq)
    {
        this.abq = abq;
    }
    public void run()
    {
        try{
            for(int i =4; i<=6;i++){
                Thread.sleep(2000);
                abq.put(i);
                System.out.println("Element added in blocking queue is : "+i);
            }
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

