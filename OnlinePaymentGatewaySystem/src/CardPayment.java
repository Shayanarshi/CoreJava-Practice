public class CardPayment implements Payment,Receipt {


    private  String transactionId;
    private String customerName;
    private  double amount;
    private String cardType;




    // getters and setter


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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }



    // constructors


    public CardPayment(String transactionId, String customerName, double amount, String cardType) {
        this.transactionId = transactionId;
        this.customerName = customerName;
        this.amount = amount;
        this.cardType = cardType;
    }
        // override


    @Override
    public void processPayment() {
        System.out.println("Card payment has been processed successfully.");

    }

    @Override
    public void generateReceipt() {

        System.out.println("----payment receipt----");
        System.out.println("Transaction Id : " + getTransactionId());
        System.out.println("Customer Name : " +getCustomerName());
        System.out.println("Amount : " + getAmount());
        System.out.println("Card Type : " + getCardType());
    }

        @Override
        public String toString()
        {
            return "------ Card Payment ------" +
                    "\nTransaction Id : " + getTransactionId() +
                    "\nCustomer Name : " + getCustomerName() +
                    "\nAmount : " + getAmount() +
                    "\nCardType : " +getCardType();
        }

    }
