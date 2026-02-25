package OOPS.Basics;

import java.sql.SQLOutput;

public class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited"+amount);
        System.out.println("Updated balance"+balance);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn"+amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance(){
        System.out.println("Name of the account holder:"+this.accountHolder);
        System.out.println("the current balance:"+this.balance);
    }
}
class Example{
    public static void  main(String[] args){
        BankAccount acct = new BankAccount("Tejal",300000);
        acct.displayBalance();
        acct.deposit(800);
        acct.displayBalance();
        acct.withdraw(900000);
        acct.displayBalance();


    }
}