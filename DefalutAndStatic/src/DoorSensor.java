public class DoorSensor implements IoTDevice{
    public DoorSensor() {
        super();
    }

    @Override
    public void connect() {
        System.out.println("Door Sensor Connected");

    }

    @Override
    public void disconnect() {
        System.out.println("Door Sensor Disconnected");
    }
}
