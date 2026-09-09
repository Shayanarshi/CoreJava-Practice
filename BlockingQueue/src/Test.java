import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(4);
        abq.add(1);
        abq.add(2);
        abq.add(3);
        Thread1 t1 = new Thread1(abq);
        Thread2 t2 = new Thread2(abq);

        t1.start();
        t2.start();
    }
}
