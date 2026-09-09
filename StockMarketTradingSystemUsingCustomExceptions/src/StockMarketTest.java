import java.util.Scanner;

public class StockMarketTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Market Status (OPEN/CLOSED) : ");
        String status = sc.nextLine();

        try {
            StockMarket.checkMarket(status);

            System.out.print("Enter Trading Balance : ");
            double balance = sc.nextDouble();

            System.out.print("Enter Number of Shares : ");
            int quantity = sc.nextInt();

            StockMarket.buyShares(balance, quantity);
        } catch (MarketClosedException e) {
            System.out.println(e.getMessage());
        } catch (StockUnavailableException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}