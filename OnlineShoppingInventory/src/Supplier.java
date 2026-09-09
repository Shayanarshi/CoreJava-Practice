public class Supplier extends  Thread{
    Inventory inventory;
    public Supplier(Inventory inventory){
        this.inventory = inventory;
    }
    @Override
    public void run() {
        inventory.addProduct(new Product(101,"laptop"));
        inventory.addProduct(new Product(102, "Keyboard"));
        inventory.addProduct(new Product(103, "Mouse"));
        inventory.addProduct(new Product(104, "Monitor"));
        inventory.addProduct(new Product(105, "Printer"));
    }
}
