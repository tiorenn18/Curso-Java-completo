package aulas_java_Iniciando;

import java.util.Scanner;

public class Exercicio_Condicionais2 {
    public static void main(String[] args) {
        /* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar */

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um valor para saber se ele é impar ou par: "); num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("--- é par.");
        }
        else{
            System.out.println("--- é impar.");
        }

        sc.close();
    }
}
