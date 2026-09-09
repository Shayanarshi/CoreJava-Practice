public class Main {
    public static void main(String[] args) {
        Order order = new Order(101,"Rahul","Veg Biryani");
        Customer customer = new Customer(order);
        Chef chef = new Chef(order);

        customer.start();
        chef.start();
    }
}
