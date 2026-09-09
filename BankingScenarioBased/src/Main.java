import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number : ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Available Balance : ");
        double balance = sc.nextDouble();

        System.out.print("Enter Today's Withdrawn Amount : ");
        double todayWithdraw = sc.nextDouble();

        System.out.print("Enter Amount to Withdraw : ");
        double amount = sc.nextDouble();

        try{
            BankAccount account = new BankAccount(accountNumber,balance,todayWithdraw);
            account.withdraw(amount);
        }catch (AccountNotFoundException e){
            System.out.println();
            System.out.println("AccountNotFoundException :");
            System.out.println(e.getMessage());
            System.out.println("Transaction Failed.");

        } catch (DailyLimitExceededException e) {
            System.out.println();
            System.out.println("DailyLimitExceededException :");
            System.out.println(e.getMessage());
            System.out.println("Transaction Failed.");
        }
        catch (InsufficientBalanceException e){
            System.out.println();
            System.out.println("Insufficient Balance  :");
            System.out.println(e.getMessage());
            System.out.println("Transaction Failed.");

        }finally {
            System.out.println("Transaction Completed");
        }
    sc.close();
    }
}
