public interface IoTDevice {
    public abstract void connect();
    public abstract void disconnect();


    public default void showHeartBeat(String device){
        try{
            Thread.sleep(10000);
        }catch (Exception ex){   }
        System.out.println(device + " is Active");
    }


    public  static boolean isvalid(String deviceId){
        if(deviceId == null || deviceId.trim().length() == 0)
            return false;
        if(deviceId.startsWith("DS")) return true;
        if(deviceId.startsWith("SL"))  return  true;
        return false;
    }
}
