package com.company;

// cannot create objects
 abstract class Bank{
    double balance;
    public Bank(double balance) {
        this.balance = balance;
    }
    abstract void withdraw(int amount);
    abstract void deposit(int amount);
    double getBalance(){
        return balance;
    }
}

 class Savings extends  Bank{
    public Savings(double balance) {
        super(balance);
    }
    @Override
    void withdraw(int amount) {
        balance = balance-amount-100;
    }
    @Override
    void deposit(int amount) {
        balance = balance+amount+100;
    }
}

 class Current extends  Bank{
    public Current(double balance) {
        super(balance);
    }
    @Override
    void withdraw(int amount) {
        balance = balance-amount;
    }

    @Override
    void deposit(int amount) {
        balance = balance+amount;
    }


}


public class Abraction {
    public static void main(String[] args) {
        Bank bank = new Savings(9000);
        bank.deposit(2000);
        System.out.println(bank.getBalance());


        bank = new Current(12000);
        bank.deposit(2000);
        System.out.println(bank.getBalance());


    }

}


