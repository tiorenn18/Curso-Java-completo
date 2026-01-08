package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Locale;
import java.util.Scanner;
import Curso_codigos_javaPart1._Classes_AulaJava.CurrencyConverter;


public class Exercicio4_CurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is a dollar price? "); double Dollarprice = sc.nextDouble();
        System.out.print("How many dollars will be bought? "); double amount = sc.nextDouble();
        
        double result = CurrencyConverter.converter(amount, Dollarprice);
        System.out.printf("Amount to be paid in reais = %.2f \n", result);
        sc.close();
    }
}
