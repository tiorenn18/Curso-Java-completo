package Aulas_e_Exercicios;

import clases_aulas_java.Acount_AulaHeranca;
import clases_aulas_java.BuinessAcount_AulaHerenca;
import clases_aulas_java.SavingAcount_AulaCasting;

public class Aula_Herança {
    // Neste arquivos temos conteudos da aula de heranças e da aula de UpCasting e DownCasting
    public static void main(String[] args) {
        Acount_AulaHeranca acc = new Acount_AulaHeranca(1001, "alex", 0.0);
        BuinessAcount_AulaHerenca bacc = new BuinessAcount_AulaHerenca(1002, "maria", 0, 500);

        //Upcasting

        Acount_AulaHeranca acc1 = bacc;
        Acount_AulaHeranca acc2 = new BuinessAcount_AulaHerenca(1003, "bob", 0, 200);
        Acount_AulaHeranca acc3 = new SavingAcount_AulaCasting(1004, "amanda", 0, 0.01);

        // DownCasting

        BuinessAcount_AulaHerenca acc4 = (BuinessAcount_AulaHerenca)acc2;
        acc4.loan(100.0);

        // BuinessAcount_AulaHerenca acc5 = (BuinessAcount_AulaHerenca) acc3;
        if (acc3 instanceof BuinessAcount_AulaHerenca) {
            BuinessAcount_AulaHerenca acc5 = (BuinessAcount_AulaHerenca) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingAcount_AulaCasting) {
            SavingAcount_AulaCasting acc5 = (SavingAcount_AulaCasting) acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        }

        Acount_AulaHeranca x = new Acount_AulaHeranca(1020, "Alex", 1000.0);
        Acount_AulaHeranca y = new SavingAcount_AulaCasting(1023, "Maria", 1000.0, 0.01);
        x.withDraw(50.0);
        y.withDraw(50.0);    

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
