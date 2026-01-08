package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_fixacao_vetor7 {
   public static void main(String[] args) {
    /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
    terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
    o vetor C gerado.  */

    Scanner sc = new Scanner(System.in);
    int n; System.out.print("Ira ter quantas casas os vetores? "); n = sc.nextInt();
    int [] vet1 = new int[n];
    int [] vet2 = new int[n];
    int [] soma = new int[n];

    System.out.println("Digite os valores para o Vetor A");
    for (int i = 0; i < vet1.length; i++){
        System.out.print("Escreva um numero para "+i +": "); vet1[i] = sc.nextInt();
    }

    System.out.println();

    System.out.println("Digite os valores para o Vetor B ");
    for (int i = 0; i < vet2.length; i++){
        System.out.print("Escreva um numero para o vetor B na posicao "+i +": "); vet2[i] = sc.nextInt();
        soma[i] = vet1[i] + vet2[i];
    }

    System.out.println();

    System.out.println(" Vetor resultante: ");
    for (int i = 0; i < vet2.length; i++){
        System.out.println(soma[i]);
    }

    sc.close();
   } 
}
