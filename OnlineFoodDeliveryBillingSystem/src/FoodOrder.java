abstract public class FoodOrder {
    private int orderId;
    private String customerName;
    private double basePrice;

  //  getter and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
  // constructor
    public FoodOrder(int orderId, String customerName, double basePrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.basePrice = basePrice;
    }


    abstract double calculateBill();

    @Override
    public String toString() {
        return " orderId         : " + orderId+
                "\n customerName : " + customerName+
                "\n basePrice    : " + basePrice;
    }

}