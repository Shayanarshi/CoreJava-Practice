class A {
    int x=1;
}
class Thread1 extends Thread {
    A a;
    Thread1(A a) { this.a = a; }

    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            a.x++;
            System.out.println("Thread1 has incremented");
            try {  Thread.sleep(1000); } catch(InterruptedException ex) { }
        }
    }
}
class Thread2 extends Thread {
    A a;

    Thread2(A a) { this.a = a; }

    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            int p = a.x;
            System.out.println("Thread2 has received : " + p);
            try { Thread.sleep(1000); } catch(InterruptedException ex) {  }
        }
    }
}
public class WithOutThreadLocal {
    public static void main(String[] args) {
        A a = new A();
        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(a);
        t1.start();
        t2.start();
    }
}
