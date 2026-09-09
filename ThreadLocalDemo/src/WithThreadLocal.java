class MyThread1 extends Thread {
    ThreadLocal threadLocal;
    MyThread1(ThreadLocal threadLocal) {
        this.threadLocal = threadLocal;
    }
    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            threadLocal.set(i);
            try { Thread.sleep(1000); } catch(InterruptedException ex) {  }
            System.out.println("Thread1 : value from ThreadLocal : " + threadLocal.get());
        }
    }
}
class MyThread2 extends Thread {
    ThreadLocal threadLocal;
    MyThread2(ThreadLocal threadLocal) {
        this.threadLocal = threadLocal;
    }
    @Override
    public void run() {
        for(int i=100; i<=105; i++) {
            threadLocal.set(i);
            try { Thread.sleep(1000); } catch(InterruptedException ex) {  }
            System.out.println("Thread2 : value from ThreadLocal : " + threadLocal.get());
        }

    }

}
public class WithThreadLocal {
    public static void main(String[] args) {
        ThreadLocal threadLocal = ThreadLocal.withInitial( () ->0);

        MyThread1 mt1 = new MyThread1(threadLocal);
        MyThread2 mt2 = new MyThread2(threadLocal);

        mt1.start();
        mt2.start();
    }
}
