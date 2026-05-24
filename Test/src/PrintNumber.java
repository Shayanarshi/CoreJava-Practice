class Account {
    long accountNumber;
    double balance;
    void deposit(double amount) {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Amount deposited to the account: " + accountNumber);
        }
        else
        {
            System.out.println("Amount is not valid");
        }
    }
    void withdraw(double amount) {
        if(amount > 0)
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn from the account: " + accountNumber);
        }
        else {
            System.out.println("Amount is not valid");
        }
    }
    double fetchBalance() {
        return balance;
    }
}
public class Test {
    public static void main(String[] args) {
        Account  ac1 = new Account();
        ac1.accountNumber = 1001;
        ac1.balance = 5000;
        ac1.deposit(2000);          
        System.out.println("Balance after depositing: " + ac1.fetchBalance());
    }
}
