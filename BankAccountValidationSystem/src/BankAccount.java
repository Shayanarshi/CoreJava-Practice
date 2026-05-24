public class BankAccount {
    private String accountHolderName;
    private double balance;

    public void setAccountHolderName(String accountHolderName){
        if(accountHolderName != null && accountHolderName.trim().length() > 0){
        this.accountHolderName=accountHolderName;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0) {
            balance = balance +depositAmount;
        }

    }
    public void withdraw(double  withdrawAmount){

        if(withdrawAmount > 0 && withdrawAmount <=balance){
            balance = balance - withdrawAmount;
        }else{
            System.out.println("Insufficient Funds");
        }
    }
    public double getBalance(){
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
