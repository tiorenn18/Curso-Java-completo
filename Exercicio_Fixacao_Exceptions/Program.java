package Exercicio_Fixacao_Exceptions;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_Fixacao_Exceptions.Model.Entities.Account;
import Exercicio_Fixacao_Exceptions.Model.Exceptions.AccountError;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Inital balance: ");
            double balance = sc.nextDouble();
            System.out.print("WithDrawn Limit: ");
            double withdrawnlimit = sc.nextDouble();
            
            Account account = new Account(number, holder, balance, withdrawnlimit);

            System.out.println();
            System.out.print("Enter Amount for withDrawn: ");
            double amount = sc.nextDouble();
            account.withDrawn(amount);
            System.out.printf("New balance: %.2f \n", account.getBalance());

        }
        catch (AccountError e){
            System.out.println("Error : " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected Error");
        }

        sc.close();
    }
}
