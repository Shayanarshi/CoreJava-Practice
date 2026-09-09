public class CourceService {
    Cource cource ;

    public CourceService(Cource cource){
        this.cource = cource;
    }
    public synchronized void  registerForCource(){


            try{
                if (cource.getAvailableSeats() -1 < 0){
                    throw new RuntimeException("Seats are not available");
                }
                cource.setAvailableSeats(cource.getAvailableSeats()-1);
//                Thread.sleep(1000);
                System.out.println("Seat is reserved for "+Thread.currentThread().getName());
            }
            catch (Exception ex) {
            System.out.println("Exception messege : "+ ex.getMessage());
            }
    }
}
