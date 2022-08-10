package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("holder: ");
            String holder = sc.next();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: "); 
            double withdrawLimit = sc.nextDouble();
            System.out.println();
            Account c = new Account(number, holder, balance, withdrawLimit);
            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            c.withdraw(amount);

            System.out.println("New balance: " + c.getBalance());




        }
        catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }

        sc.close();

    }
}
