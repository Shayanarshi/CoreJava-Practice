public class Main {
    public static void main(String[] args) {
        UpiPayment upiPayment = new UpiPayment("TX101","Rahul",2500);
        CardPayment cardPayment = new CardPayment("TX102","Priya",5000,"Credit Card");

        System.out.println(upiPayment);
        upiPayment.processPayment();
        upiPayment.generateReceipt();

        System.out.println();

        System.out.println(cardPayment);
        cardPayment.processPayment();
        cardPayment.generateReceipt();


    }


}
