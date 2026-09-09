public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runway runway = new Runway();
        System.out.println("Runway Available");
        Thread.sleep(1000);
        System.out.println();

        String [] flightNumber ={
                "AI101 ",
                "6E220 ",
                "UK450"
        };
        String [] flightName ={
                "Air India",
                "IndiGo",
                "Vistara"
        };
        Aircraft[] aircrafts = new  Aircraft[flightNumber.length];

        for (int i = 0; i < aircrafts.length; i++) {
            aircrafts[i] = new Aircraft(
                    flightNumber[i],
                    flightName[i],
                    runway
            );
        }
            for (Aircraft aircraft:aircrafts){
                aircraft.start();
            }
    }
}
