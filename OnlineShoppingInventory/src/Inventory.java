
public class Inventory {
    private Product[] products = new Product[5];
    private int count = 0;

    public synchronized void addProduct(Product product) {
        try {
            while (count == products.length) {
                System.out.println("Inventry Full");
                System.out.println("Supplier waiting..");
                wait();
            }
            products[count] = product;
            count++;
            System.out.println("Supplier added : "+ product.getProductName());
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void removeProduct(){
        try {
            while (count == 0) {
                System.out.println("Inventory is Empty....");
                System.out.println("Customer is waiting..");
                wait();
            }
            Product product1 = products[0];
            for (int i = 0; i <count-1 ; i++) {
                products[i]= products[i+1];
            }
            products[count-1]=null;
            count--;
            System.out.println("Customer Purchased : "+ product1.getProductName());
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
