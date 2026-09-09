public class Customer extends Thread{

    Order order;
    public Customer(Order order){
        this.order= order;
    }
    @Override
    public void run() {
        synchronized (order) {
            System.out.println("Customer "+order.getCustomerName()+ " placed the order.");
            System.out.println();
            order.display();

            System.out.println();
            System.out.println("Customer Waiting....");
            try {
                order.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
            System.out.println(order.getCustomerName()+ " Collected the order");
        }
    }
}
