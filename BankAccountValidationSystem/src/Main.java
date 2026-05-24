public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolderName("Ravi");
        System.out.println("Account created For:"+account.getAccountHolderName());
        account.deposit(5000);
        System.out.println("Amount deposited: 5000");
        System.out.println("Current Balance: "+account.getBalance());
        account.withdraw(4000);
        System.out.println("Current balance: "+ account.getBalance());


    }
}
