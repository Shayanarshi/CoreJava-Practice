public class SmartLight implements IoTDevice{
    public SmartLight() {
        super();
    }

    @Override
    public void connect() {
        System.out.println("SmartLight Connected");
    }

    @Override
    public void disconnect() {
        System.out.println("SmartLight Disconnected");
    }

    // override the default method

    @Override
    public  void showHeartBeat(String device){
        try{
            Thread.sleep(10000);
        }catch (Exception ex){   }
        System.out.println("\u001B[34m" + device + " is Active"+"\u001B[33m");
    }



}