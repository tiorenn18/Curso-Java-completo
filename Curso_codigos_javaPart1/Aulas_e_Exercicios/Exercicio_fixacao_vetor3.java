package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_fixacao_vetor3 {
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor */

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    double [] num = new double [n];
    double soma = 0;

    for (int i = 0; i < num.length; i++){
        System.out.print("Digite um valor para a posição "+(i+1) + ": "); double resp = sc.nextDouble();
        soma += resp;
        num[i] = resp;
    }

    System.out.print("Valores: ");
    for (int i = 0; i < num.length; i++){
        System.out.print(num[i]+ " ");
    }
    System.out.println();
    System.out.println("Soma: "+ soma);

    double media = soma / n;

    System.out.printf("Media: %.2f \n", media);
    sc.close();
    }
}
