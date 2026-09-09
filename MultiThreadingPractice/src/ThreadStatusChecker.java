class ThreadStatus extends  Thread{
    @Override
    public  void run(){
    }
}
public class ThreadStatusChecker {

    public static void main(String[] args) throws InterruptedException {
        ThreadStatus t1 = new ThreadStatus();
        System.out.println("Before Start : "+t1.isAlive());
        t1.start();
        System.out.println("After Start : "+t1.isAlive());
        t1.join();
        System.out.println("Thread Completed");
        System.out.println("After Join: "+t1.isAlive());
    }
}
