package com.example2;



abstract class Accounts {
    abstract void addToAccount(double amount);
    abstract void subFromAccount(double amount);
    abstract boolean checkPin(int pin);
    abstract String showName();
    abstract double show_Balance();
}

class CurrentAccount extends Accounts{
    final int acc_num;
    public String name;
    private double balance;
    private int pin;
    private double odLimit = 5000;

    CurrentAccount(int num,String nam, int pin, double balance){
        acc_num=num; name=nam; this.pin = pin; this.balance=balance;
    }

    protected boolean checkPin(int pin){
        return (pin == this.pin);
    }

    protected String showName(){
        return name;
    }

    protected void addToAccount(double amount){
        balance += amount;
        System.out.println(amount + " rupees has been credited to your current account - " + acc_num);
    }

    protected void subFromAccount(double amount){

        if (amount <= balance){
            balance -= amount;
            System.out.println(amount + " rupees has been debited from your account - " + acc_num);
        }
        else if (amount <= balance+odLimit){
            if (balance >=0) {
                odLimit = odLimit - (amount - balance);
                balance -= amount;
                System.out.println(amount + " rupees has been debited from your account - " + acc_num);
                System.out.println("The remaining Overdraft limit is " + show_odLimit());
            }

        }
        else System.out.println("Your balance is less than the withdrawal amount. Transaction is not possible.");


    }

    public double show_Balance(){
        return balance;
    }
    protected double show_odLimit(){
        return odLimit;
    }

}

 class SavingsAccount extends Accounts {
    final int acc_num;
    public String name;
    private double balance;
    private int pin;

    SavingsAccount(int num,String nam, int pin, double balance){
        acc_num=num; name=nam; this.pin = pin; this.balance=balance;
    }

    public boolean checkPin(int pin){
        return (pin == this.pin);
    }

     protected String showName(){
         return name;
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