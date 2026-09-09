public interface WiFiService {
    public  default  void connect(){
        System.out.println("Connecting through WiFi...");
    }
}