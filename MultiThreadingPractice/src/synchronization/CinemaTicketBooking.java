package synchronization;
class MyBooking extends  Thread{
    private CinemaTicketBooking booking;
    private  int seats;
    public MyBooking(CinemaTicketBooking booking,int seats){
        this.booking = booking;
        this.seats = seats;
    }
    @Override
    public void run() {
        booking.bookTickets(seats);
    }
}
public class CinemaTicketBooking {
    private  int totalSeats;
    public CinemaTicketBooking(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    public synchronized  void bookTickets(int bookSeat) {
        if (totalSeats >= bookSeat) {
            System.out.println(Thread.currentThread().getName()+" Booking Successful");
            totalSeats = totalSeats - bookSeat;
            System.out.println("Remaining Seats : "+ totalSeats);
        } else {
            System.out.println(Thread.currentThread().getName() + " Booking Failed");
            System.out.println("Only " + totalSeats + " Seats Available");
        }
    }
}
