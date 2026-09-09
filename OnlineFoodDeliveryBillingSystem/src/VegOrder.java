public class VegOrder extends FoodOrder{
    private double packingCharge;

        // g and s
    public double getPackingCharge() {
        return packingCharge;
    }

    public void setPackingCharge(double packingCharge) {
        this.packingCharge = packingCharge;
    }

    @Override
    public double calculateBill() {
        return getBasePrice()+getPackingCharge();
    }
  // constructor

    public VegOrder(int orderId, String customerName, double basePrice, double packingCharge) {
        super(orderId, customerName, basePrice);
        this.packingCharge = packingCharge;
    }
    // toString


    @Override
    public String toString() {
        return super.toString() +
                "\n packingCharge : "+ packingCharge ;
    }
}

