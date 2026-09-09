import java.util.Scanner;

public class LaptopTest {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter laptop start status (notstart/ok): ");
        String reason = sc.nextLine();


        try {
            Laptop.start(reason);
        } catch (LaptopNotStarting e) {
            System.out.println(e.getMessage());
        }


        System.out.print("Enter battery percentage:");
        int battery = sc.nextInt();
        try {
            Laptop.batteryStatus(battery);
        } catch (BatteryLow e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Enter laptop temperature: ");
        int temperature = sc.nextInt();
        try{
            Laptop.checkTemperature(temperature);
        } catch (LaptopOverHeat e) {
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}
