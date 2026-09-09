public class Runway{
    boolean available = true;
    synchronized  void displayLanding(Aircraft aircraft) throws InterruptedException {
        while (!available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available= false;
        System.out.println(aircraft.flightNumber+"Landing.......");

            Thread.sleep(2000);

        System.out.println("Landing Completed");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("Runway Cleared");
        System.out.println();


        available= true;
                notify();

    }
}
