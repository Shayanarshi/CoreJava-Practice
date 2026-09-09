public class Test {
    public static void main(String[] args) {
        IoTDevice doorSensor = new DoorSensor();

        if (IoTDevice.isvalid("DS-01")) {
            doorSensor.connect();
            doorSensor.showHeartBeat("DS-01");
            doorSensor.disconnect();
        }else{
            System.out.println("Door Sensor Device Id is invalid");
        }

        System.out.println("===================");

        IoTDevice smartLight = new SmartLight();
        if(IoTDevice.isvalid("SL-01")) {

            smartLight.connect();
            smartLight.showHeartBeat("SL-01");
            smartLight.disconnect();
        }
        else{
            System.out.println("SmartLight device id is Invalid");
        }
    }
}
