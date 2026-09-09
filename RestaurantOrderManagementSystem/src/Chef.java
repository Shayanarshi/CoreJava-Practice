public class Chef extends  Thread{

    Order order;
    public  Chef(Order order){
        this.order = order;
    }
    @Override
    public void run() {
        synchronized (order){
            System.out.println("Chef Started Preparing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
            System.out.println("Order is ready");
            order.notify();
            System.out.println("Chef Notified Customer.");
        }

    }
}
