public class Order {
    private int OrderID;
    private String CustomerName;
    private String FoodItem;

    public Order(int orderID, String customerName, String foodItem) {
        OrderID = orderID;
        CustomerName = customerName;
        FoodItem = foodItem;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getFoodItem() {
        return FoodItem;
    }

    public void setFoodItem(String foodItem) {
        FoodItem = foodItem;
    }


    public  void display(){
        System.out.println("Order Id : "+getOrderID());
        System.out.println("Food Item : "+ getFoodItem());
    }

}
