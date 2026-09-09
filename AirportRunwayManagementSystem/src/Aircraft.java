public class Aircraft extends Thread{
  Runway runway;
    String  flightNumber;
    String airlineName;

    public Aircraft(String  flightNumber,String airlineName,Runway runway){
        this.flightNumber= flightNumber;
        this.airlineName =airlineName;
        this.runway = runway;
    }

    @Override
    public void run() {
        try {
            runway.displayLanding(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
