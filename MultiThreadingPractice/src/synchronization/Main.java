package synchronization;

public class Main {
    public static void main(String[] args) {
 Account account = new Account(1001,5000);
        ATM1 t1 = new ATM1(account);
        ATM2 t2 = new ATM2(account);

        t1.setName("ATM-1");
        t2.setName("ATM-2");

        t1.start();
        t2.start();
    }
}
