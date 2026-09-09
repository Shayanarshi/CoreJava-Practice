class PassengerVerification extends  Thread{
    @Override
    public  void run(){
        System.out.println("Passenger Verification Completed");
    }
}
class SeatAllocation extends  Thread{
    @Override
    public  void run(){
        System.out.println("Seat Allocation Completed");
    }
}
class TicketGeneration extends  Thread{
    @Override
    public  void run(){
        System.out.println("Ticket Generated Successfully");
    }
}
public class RailwayTicketBooking {
    public static void main(String[] args) throws InterruptedException {
        PassengerVerification t1 = new PassengerVerification();
        SeatAllocation t2 = new SeatAllocation();
        TicketGeneration t3 = new TicketGeneration();

        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        t3.start();
    }
}
