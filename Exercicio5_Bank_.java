package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;
import aulas__java_meio._Classes_AulaJava.account;

public class Exercicio5_Bank_ {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        account account;

        System.out.println("---- Acount bank");
        System.out.print("Acount Number: "); int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Acount Hold: "); String Hold = sc.nextLine();


        System.out.print("Is there na initial deposit (y/n)? "); char resp = sc.next().charAt(0);

        if (resp == 'y') {
            System.out.print("Enter initial deposity value: "); Double initialdeposity = sc.nextDouble();
            account = new account(number,Hold,initialdeposity);
            System.out.println();
        }
        else {
        account = new account(number, Hold);
        }

        System.out.println("Acount data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter deposity value: "); double deposity = sc.nextDouble();
        account.Deposity(deposity);
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a Witchdraw value: "); double saque = sc.nextDouble();
        account.saque(saque);
        System.out.println(account);

        sc.close();
    }
}
