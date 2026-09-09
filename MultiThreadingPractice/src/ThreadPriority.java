
class  MyThread1 extends Thread{
    @Override
    public void run(){

    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getName()+" Priority: "+ t1.getPriority());
        System.out.println(t2.getName()+" Priority: "+ t2.getPriority());
        System.out.println(t3.getName()+" Priority: "+ t3.getPriority());

    }
}
