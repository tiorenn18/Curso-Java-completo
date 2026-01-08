package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_fixacao_vetor9 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, npares;
        double soma,media;

        System.out.print("Quantas casas vão ter o Vetor? "); n = sc.nextInt();
        int [] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: "); vetor[i] = sc.nextInt();
        }

        soma = 0;
        npares = 0;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                npares ++;
            }
        }
        if (npares == 0) {
            System.out.println("Nenhum numero par");
        }

        else{
        media = (Double)soma / npares;
        
        System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }
        sc.close();
    }
}
