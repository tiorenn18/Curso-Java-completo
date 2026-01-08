package Aulas_e_Exercicios;

import clases_aulas_java.Acount_AulaHeranca;
import clases_aulas_java.BuinessAcount_AulaHerenca;
import clases_aulas_java.SavingAcount_AulaCasting;

public class Aula_Sobreposicao{
    public static void main(String[] args) {
        Acount_AulaHeranca acc1 = new Acount_AulaHeranca(1001, "alex", 1000);
        acc1.withDraw(200.0);
        System.out.println(acc1.getBalance());

        Acount_AulaHeranca acc2 = new SavingAcount_AulaCasting(1001, "maria", 1000, 0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2.getBalance());
        
        Acount_AulaHeranca acc3 = new BuinessAcount_AulaHerenca(1003, "max", 1000, 500);
        acc3.withDraw(200.0);
        System.out.println(acc3.getBalance());

    }
}