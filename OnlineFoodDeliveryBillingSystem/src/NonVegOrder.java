public class NonVegOrder extends FoodOrder{

    private double packingCharge;
    private  double meatCharge;

    // gettrs and sellets


    public double getPackingCharge() {
        return packingCharge;
    }

    public void setPackingCharge(double packingCharge) {
        this.packingCharge = packingCharge;
    }

    public double getMeatCharge() {
        return meatCharge;
    }

    public void setMeatCharge(double meatCharge) {
        this.meatCharge = meatCharge;
    }
    @Override
    double calculateBill() {
        return getPackingCharge()+getMeatCharge()+getBasePrice();
    }
  // constructor adde d
    public NonVegOrder(int orderId, String customerName, double basePrice, double packingCharge, double meatCharge) {
        super(orderId, customerName, basePrice);
        this.packingCharge = packingCharge;
        this.meatCharge = meatCharge;
    }

    // to string

    @Override
    public String toString() {
        return super.toString() +
                "\n packingCharge : " + packingCharge+
                "\n meatCharge    : " + meatCharge;
    }
}
