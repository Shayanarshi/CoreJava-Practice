public class Main {
    public static void main(String[] args) {
        SmartHomeDevice smartHomeDevice = new SmartHomeDevice(101,"Bedroom");
        System.out.println("------- Smart Home Device -------");
        System.out.println(smartHomeDevice);
        smartHomeDevice.connect();
    }
}
