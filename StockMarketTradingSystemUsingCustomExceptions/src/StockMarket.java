public class StockMarket {
    private static final double SHARE_PRICE = 2500.0;
    private static final int AVAILABLE_SHARES = 100;




    public static  void checkMarket(String status) throws MarketClosedException{

        if (status.equalsIgnoreCase("CLOSED")){
            throw new MarketClosedException("Stock Market is Closed. Trading is not allowed.");

        }else{
            System.out.println("Stock Market is Open.\n");
        }
    }

    public static  void buyShares(double balance, int quantity)throws InsufficientBalanceException,StockUnavailableException{
            double requiredAmount = quantity * SHARE_PRICE;
        if (quantity> AVAILABLE_SHARES){
            throw new StockUnavailableException("Requested shares are not available.");
        }

        if (balance < requiredAmount){
            throw new InsufficientBalanceException("Insufficient Trading Balance.");
        }
        System.out.println("Shares Purchased Successfully.\n");
        System.out.println("Purchased Shares : " + quantity);
        System.out.println("Total Amount Paid : " + requiredAmount);
        System.out.println("Remaining Balance : " + (balance - requiredAmount));

    }
}
