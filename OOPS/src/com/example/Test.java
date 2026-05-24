//create a class with the name “Account”,
//Define the fields  accountNumber and balance.
//Define the methods deposit(), withdraw() and fetchBalance().
//create at least two objects, then invoke the methods.
package com.example;

class Account{
     long accountNumber;
     double balance;
    void deposit(double amount){
        if (amount>0){
            balance+= amount;
            System.out.println("The Amount is deposited to Account Number " +accountNumber);
        }else{
            System.out.println("Not a valid input");
        }
    }

    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance-=amount;
            System.out.println("The amount withdrawn from Account Number  "+accountNumber);
        }else{
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    double fetchBalance(){
        return balance;
    }

}
public class Test {
    public static void main(String[] args) {
        Account ac1 = new Account();
        Account ac2 = new Account();

        ac1.accountNumber=10001;
        ac1.balance = 10000;
        ac2.accountNumber= 10002;
        ac2.balance=9000;


        ac1.deposit(5000);
        System.out.println(" Balance after deposit =" + ac1.fetchBalance());
        ac2.withdraw(3000);
        System.out.println("Balance after withdrawal = "+ ac2.fetchBalance());

    }
}
