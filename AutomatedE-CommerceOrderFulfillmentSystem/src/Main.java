public class Main {

    public static void main(String[] args) {

        Product[] inventory={
                new Product("P101","Wireless Mouse",25.0,5),
                new Product("P102","Mechanical Keyboard",80.0,2),
                new Product("P103","USB-C Cable",15.0,10)
        };

        OrderFulfillmentSystem system=new OrderFulfillmentSystem(inventory);

        String rawOrder="P101:2,P102:1,P103:5";

        system.processOrderPayload(rawOrder);
    }
}