public class Account {
    private final long acno;
    private double balance;
    // constructor creation
    public Account(long acno, double balance){
        this.acno = acno;
        this.balance = balance;
    }
    public void deposit(double amount){
        try {
            if (amount <= 0) {
                throw new InavalidAmountException("Amount must be greater than 0");
            }
            this.balance += amount;
            System.out.println("Deposited " + amount);
        }catch(InavalidAmountException e){
            System.out.println(e);
        }
    }
    public void withdraw(double amount){
        try {
            if (amount <= 0) {
                throw new InavalidAmountException("Amount must be grater than 0");
            }
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Withdrawn " + amount);
            } else {
                throw new InsufficientBalanceException("Insufficient balance.");
            }
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch (InavalidAmountException e){
            System.out.println(e);
        }
    }
}
