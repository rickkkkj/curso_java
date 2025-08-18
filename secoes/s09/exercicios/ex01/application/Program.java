package s09.exercicios.ex01.application;

import s09.exercicios.ex01.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // variables
        int id;
        double deposit;
        double initialDeposit;
        String name;
        String response;
        Bank bank;

        // input
        System.out.print("Enter account number: ");
        id = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); // consume the newline character because nextInt does not consume it
        name = sc.nextLine();
        // check if there is an initial deposit
        System.out.print("Is there an initial deposit (y/n)? ");
        response = sc.next().toLowerCase();
        if(response.equals("y")){
            System.out.print("Deposit value: ");
            initialDeposit = sc.nextDouble();
            // init bank object with deposit
            bank = new Bank(id, name, initialDeposit);
        }else{
            // init bank object without deposit
            bank = new Bank(id, name);
        }

        // output
        System.out.println("Account data:");
        System.out.println(bank);

        response = "w"; // initialize response to enter the loop
        // loop for deposit or withdrawal
        int repetition = 0;
        do {
            // deposit or withdrawal
            // check if it is the first iteration
            if(repetition == 0) {
                System.out.print("you can make a deposit or a withdrawal (d/w/n)?");
            }else{
                System.out.println("you can make another deposit or withdrawal (d/w/n)?");
            }
            response = sc.next().toLowerCase();
            if(response.equals("d")){
                System.out.print("Enter a deposit value: ");
                deposit = sc.nextDouble();
                bank.deposit(deposit);
                System.out.println("Updated account data:");
                System.out.println(bank);
            }else if(response.equals("w")){
                System.out.print("Enter a withdrawal value: ");
                deposit = sc.nextDouble();
                bank.subtraction(deposit);
                System.out.println("Updated account data:");
                System.out.println(bank);
            }else if(response.equals("n")){
                System.out.println("No deposit and withdrawal made.");
            }else{
                System.out.println("invalid option, please enter 'd' for deposit, 'w' for withdrawal or 'n' for none.");
            }
            repetition = 1;
        }while (response.equals("d") || response.equals("w"));

        sc.close();
    }
}
