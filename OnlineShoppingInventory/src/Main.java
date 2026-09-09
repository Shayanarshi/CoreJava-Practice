public class Main {
    public static void main(String[] args) throws InterruptedException {
        Inventory inventory = new Inventory();

        Supplier supplier =  new Supplier(inventory);
        Customer customer = new Customer(inventory);

        supplier.start();
        customer.start();


        supplier.join();
        customer.join();

        System.out.println("Inventory Updated Successfully");
    }
}