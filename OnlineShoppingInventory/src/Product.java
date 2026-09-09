public class Product {
    private   int ProductID;
    private String ProductName;

    public Product(int productID, String productName) {
        ProductID = productID;
        ProductName = productName;
    }
    public int getProductID() {
        return ProductID;
    }

    public String getProductName() {
        return ProductName;
    }
}
