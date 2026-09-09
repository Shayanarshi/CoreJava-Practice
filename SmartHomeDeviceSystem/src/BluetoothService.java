public interface BluetoothService {
    default void connect(){
        System.out.println("Connecting through Bluetooth...");
    }
}
