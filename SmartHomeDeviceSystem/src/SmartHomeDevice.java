public class SmartHomeDevice implements  WiFiService,BluetoothService{

    private int deviceId;
    private String deviceName;
     // g and s
    public int getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
        // constructor
    public SmartHomeDevice(int deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }
    @Override
    public void connect() {
        WiFiService.super.connect();
        BluetoothService.super.connect();
        System.out.println("Smart Device Connected Successfully.");
    }
    @Override
    public String toString() {
        return
                         "deviceId   : " + deviceId+
                        "\ndeviceName : " + deviceName;
    }
}





