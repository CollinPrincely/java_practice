package com.examples.atm_sim;

abstract class AccFunctions{
    abstract void addToAccount(double amount);
    abstract void subFromAccount(double amount);
}
public class Account extends AccFunctions{
    final int acc_num;
    public String name;
    private double balance;
    private int pin;

    Account(int num,String nam, int pin, double balance){
        acc_num=num; name=nam; this.pin = pin; this.balance=balance;
    }

    protected boolean checkPin(int pin){
        return (pin == this.pin);
    }

    protected void addToAccount(double amount){
        balance += amount;
        System.out.println(amount + " rupees has been credited to your account - " + acc_num);
    }

    protected void subFromAccount(double amount){

        if (amount <= balance){
            balance -= amount;
            System.out.println(amount + " rupees has been debited from your account - " + acc_num);
        }
        else System.out.println("Your balance is less than the withdrawal amount. Transaction is not possible.");


    }

    public double show_Balance(){
        return balance;
    }

}
