package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_fixacao_vetor6 {
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).  */
    
        Scanner sc = new Scanner(System.in);
        int posmaior,n = sc.nextInt();
        double [] nums = new double[n];

        for (int i = 0; i < nums.length; i++){
            System.out.print("Escreva o valor para "+(i) + ": "); nums[i] = sc.nextDouble();
        }
        
        double maior;
        maior = nums[0];
        posmaior = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > maior) {
                maior = nums[i];
                posmaior = i;
            }
        }

    System.out.printf("maior valor = %.1f \n", maior);
    System.out.printf("posicao do maior valor = %d \n", posmaior);

    sc.close();

    }
}