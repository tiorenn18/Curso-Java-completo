package aulas__java_meio;

import java.util.Scanner;

public class Exercicio_fixacao_vetor2 {
    public static void main(String[] args) {
        /*   Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

        Scanner sc = new Scanner(System.in);
        int n,resp;
        System.out.print("Digite um valor de 1 a 10 para ser o numero de itens no vetor: "); resp = sc.nextInt();

        if (resp < 0 | resp > 10) {
            System.out.println("digite umn valor maior que zero e no maximo 10.");
        }
        
        else{
            n = resp;
            int[] vect = new int[n];
            int[] vectnegativo = new int[n];
            for (int i = 0; i < vect.length; i++){
                System.out.print("Digite um valor: "); vect[i] = sc.nextInt();
                if (vect[i] < 0) {
                    vectnegativo[i] = vect[i];
                }
            }

            System.out.println("Numeros negativos: ");
            for (int i = 0; i < vectnegativo.length; i++ ){
                if (vectnegativo[i] < 0) {
                    System.out.println(vectnegativo[i]);
                }
            }
        }
        sc.close();
    }
}
