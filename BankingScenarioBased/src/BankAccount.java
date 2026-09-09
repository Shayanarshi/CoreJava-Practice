public class BankAccount {
    private int accountNumber;
    private double balance;
    private double todayWithdraw;


    public BankAccount(int accountNumber, double balance, double todayWithdraw) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.todayWithdraw = todayWithdraw;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTodayWithdraw() {
        return todayWithdraw;
    }

    public void setTodayWithdraw(double todayWithdraw) {
        this.todayWithdraw = todayWithdraw;
    }
    public void withdraw(double amount)throws AccountNotFoundException,
            DailyLimitExceededException,
            InsufficientBalanceException{

        if (accountNumber!=12345){
            throw new AccountNotFoundException();
        }
        System.out.println("Account Verified Successfully.");

        if (todayWithdraw+amount>50000){
            throw new DailyLimitExceededException();
        }

        if (amount>getBalance()){
            throw new InsufficientBalanceException();
        }
        balance = balance- amount;
        todayWithdraw = todayWithdraw +amount;

        System.out.println("Withdrawal Successful.");
        System.out.println("Amount Withdrawn : ₹" + amount);
        System.out.println("Remaining Balance : ₹" + balance);
        System.out.println("Today's Total Withdrawal : ₹" + todayWithdraw);
    }
}
