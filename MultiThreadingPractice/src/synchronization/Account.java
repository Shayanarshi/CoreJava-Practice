package synchronization;

import java.security.PrivateKey;

class Account {
    private long accountNumber;
    private double balance;
  // constructor
     public Account(long accountNumber, double balance) {
         this.accountNumber = accountNumber;
         this.balance = balance;
     }

     public synchronized void withdraw(double amount){
         System.out.println(Thread.currentThread().getName());
         if (balance >= amount) {
             balance = balance - amount;
             System.out.println("------------");
             System.out.println("Withdrawal Successful");
             System.out.println("Remaining Balance : " + balance);
         } else {
             System.out.println("------------");
             System.out.println("Insufficient Balance");
         }
         System.out.println();
     }
 }
class ATM1 extends  Thread{
     private  Account account;

     public ATM1(Account account){
         this.account= account;
     }
    @Override
    public void run() {
        account.withdraw(3000);
    }
}

class ATM2 extends  Thread{

    private  Account account;
    public  ATM2( Account account){
        this.account = account;
    }
    @Override
    public void run() {
        account.withdraw(2500);
    }
}





