class  MyThread4 implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " Notification Sent");

    }
}
public class Notification {
    public static void main(String[] args) {

        MyThread4 obj = new MyThread4();

        Thread SMSService = new Thread(obj);
        Thread EmailService = new Thread(obj);
        Thread  WhatsAppService = new Thread(obj);

        SMSService.setName("SMS Service");
        EmailService.setName("Email Service");
        WhatsAppService.setName("WhatsApp Service");

        SMSService.start();
        EmailService.start();
        WhatsAppService.start();

        System.out.println();
    }
}
