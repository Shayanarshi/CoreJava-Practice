class  MyThread5 extends  Thread{
    @Override
    public  void run(){
        System.out.println(Thread.currentThread().getName());    }
}
public class OrderDetails {
    public static void main(String[] args) {

        MyThread5 OrderAccepted = new MyThread5();
        MyThread5 FoodPreparing = new MyThread5();
        MyThread5 DeliveryStarted = new MyThread5();

        OrderAccepted.setName("Order Accepted");
        FoodPreparing.setName(" Food Preparing");
        DeliveryStarted.setName("Delivery Started");

        OrderAccepted.start();
        FoodPreparing.start();
        DeliveryStarted.start();
    }
}
