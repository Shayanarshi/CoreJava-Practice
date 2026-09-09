public class Customer extends Thread{
    Inventory inventory;
    public  Customer (Inventory inventory){
        this.inventory = inventory;
    }
    @Override
    public void run() {
        inventory.removeProduct();
        inventory.removeProduct();
        inventory.removeProduct();
    }
}
