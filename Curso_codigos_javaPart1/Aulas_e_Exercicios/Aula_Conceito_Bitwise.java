package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Aula_Conceito_Bitwise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mask = 0b1000000;
        int num = sc.nextInt();

        if ((num & mask) != 0 ) {
            System.out.println("O sexto bit é Verdadeiro");            
        }
        else{
            System.out.println("O sexto bit é Falso.");
        }
        sc.close();
    }
}