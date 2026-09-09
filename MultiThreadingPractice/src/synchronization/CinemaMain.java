package synchronization;

public class CinemaMain {
    public static void main(String[] args) throws InterruptedException {
        CinemaTicketBooking cinema = new CinemaTicketBooking(20);
        MyBooking t1 = new MyBooking(cinema,8);
        MyBooking t2 = new MyBooking(cinema,10);
        MyBooking t3 = new MyBooking(cinema,5);

        t1.setName("Customer-1");
        t2.setName("Customer-2");
        t3.setName("Customer-3");

        t1.start();
        Thread.sleep(1000);
        t2.start();
        t3.start();

    }
}
