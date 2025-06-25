package com.examples.atm_sim;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args){

        String choice;
        Scanner s = new Scanner(System.in);
        Account a = new Account(1001,"Subash",123,10000);

        System.out.println("\nWelcome to ABC Bank ATM Service\n");
        System.out.print("Enter your ATM pin number - ");
        int p = s.nextInt();

        if (a.checkPin(p)) {
            System.out.println("Hello " + a.name);

            while (true) {

                System.out.println("Choose an option from the menu");
                System.out.println("Press d to Deposit");
                System.out.println("Press w to Withdraw");
                System.out.println("Press c to Check Balance");
                System.out.println("Press e to exit");
                System.out.print("Enter your choice - ");
                choice = s.next();

                if (choice.equals("c")) {
                    System.out.println("\nYour account balance is " + a.show_Balance() + "\n");
                    System.out.print("press y for another transaction or any other key to exit -");
                    String sel = s.next();
                    if (sel.equals("y")) continue;
                    else break;
                }

                if (choice.equals("d")) {

                    System.out.print("\nEnter the amount to deposit - ");
                    double dep_am = s.nextDouble();
                    a.addToAccount(dep_am);
                    System.out.println("Your new account balance is " + a.show_Balance() + "\n");

                    System.out.print("press y for another transaction or any other key to exit -");
                    String sel = s.next();
                    if (sel.equals("y")) continue;
                    else break;
                }

                if (choice.equals("w")) {

                    System.out.print("\nEnter the amount to withdraw - ");
                    double wit_am = s.nextDouble();
                    a.subFromAccount(wit_am);
                    System.out.println("Your new account balance is " + a.show_Balance() + "\n");

                    System.out.print("press y for another transaction or any other key to exit -");
                    String sel = s.next();
                    if (sel.equals("y")) continue;
                    else break;
                }

                if (choice.equals("e")) {
                    break;
                }

                System.out.println("\nPlease choose the correct option\n");
            }
        }
        else System.out.println("\nWrong Pin");
        System.out.println("\nThank you for banking with ABC Bank");
        s.close();
    }
}
