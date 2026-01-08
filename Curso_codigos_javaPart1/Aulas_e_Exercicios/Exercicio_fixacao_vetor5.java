package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_fixacao_vetor5 {
    public static void main(String[] args) {
        /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.  */


        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? "); int n = sc.nextInt();
        int [] nums = new int[n];
        int pares = 0;

        for (int i = 0; i < nums.length; i++){
            System.out.print("digite um numero: "); int num = sc.nextInt();
            nums[i] = num;
        }
        
        System.out.print("Pares: ");
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i]+" ");
                pares ++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de Pares: " + pares);
        sc.close();
    }
}
