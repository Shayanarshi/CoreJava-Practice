public class UpiPayment implements Payment,Receipt{



    private  String transactionId;
    private String customerName;
    private  double amount;
    // g ans s

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }





    // constructor

    public UpiPayment(String transactionId, String customerName, double amount) {
        this.transactionId = transactionId;
        this.customerName = customerName;
        this.amount = amount;
    }


    // override
    @Override
    public void processPayment() {
        System.out.println("UPI Payment Processed Successfully.");
    }

    @Override
    public void generateReceipt() {

        System.out.println("Receipt Details");
        System.out.println("Transaction Id : " + getTransactionId());
        System.out.println("Amount : " + getAmount());

    }

    @Override
    public String toString()
    {
        return "------ UPI Payment ------" +
                "\nTransaction Id : " + getTransactionId() +
                "\nCustomer Name : " + getCustomerName() +
                "\nAmount : " + getAmount();
    }
}
