class  MyThread3 implements Runnable{
    @Override
    public void run(){
        System.out.println("Running : " + Thread.currentThread().getName());
    }
}
public class RunnableDemo {
    public static void main(String[] args) {

        MyThread3 obj = new MyThread3();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("DataLoader");
        t2.setName("ReportGenerator");

        t1.start();
        t2.start();


    }

}
