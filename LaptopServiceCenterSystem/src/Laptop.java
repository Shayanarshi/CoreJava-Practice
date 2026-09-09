public class Laptop {
    public static  void start(String reason) throws LaptopNotStarting{
            if (reason.equals("notstart")){
                throw new LaptopNotStarting("Laptop is not starting due to an unknown issue \n");
            }else {
                System.out.println("Laptop started successfully \n");
            }
    }

    public  static void batteryStatus(int batteryPercentage) throws BatteryLow{
        if (batteryPercentage<15){
            throw new BatteryLow("Battery level is critically low\n");
        }else {
            System.out.println("Battery level is sufficient \n");
        }
    }

    public static  void checkTemperature(int temperature)throws LaptopOverHeat{
        if (temperature>80){
            throw new LaptopOverHeat("Laptop temperature exceeded 80 degrees \n");
        }else {
            System.out.println("Laptop temperature is normal \n");
        }

    }

}
