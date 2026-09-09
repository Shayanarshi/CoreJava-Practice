class CountdownThread extends  Thread{
    @Override
    public  void run(){

        for (int i = 10; i >=1 ; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Countdown Completed");
    }
}
public class CountdownTimer {
    public static void main(String[] args) {
        CountdownThread t1 = new CountdownThread();
        t1.start();
    }
}
