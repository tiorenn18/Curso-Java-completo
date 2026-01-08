package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_Condicionais1 {
    public static void main(String[] args) {
        /* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */
    
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Digite um numero: "); num = sc.nextInt();

        System.out.println();
        System.out.println("é um numero negativo? ");
        
        if (num >= 0) {
            System.out.println("----- Não é negativo.");
        } 
        else {
            System.out.println("----- É negativo. ");
        }

        sc.close();
    }
}
