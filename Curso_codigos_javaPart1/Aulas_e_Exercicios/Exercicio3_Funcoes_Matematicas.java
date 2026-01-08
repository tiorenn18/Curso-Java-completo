package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio3_Funcoes_Matematicas {
    public static void main(String[] args) {
        /* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). Entrada: 5 6 7 8 Saida: Diferença = -26 */    
    
    Scanner sc = new Scanner(System.in);
    int a, b, c, d; 

    System.out.print("Escreva um valor: "); a = sc.nextInt();
    System.out.print("escreva um outro Valor: "); b = sc.nextInt();
    System.out.print("escreva um outro Valor: "); c = sc.nextInt();
    System.out.print("escreva um outro Valor: "); d = sc.nextInt();
    
    int Diferenca = a * b - (c * d);

    System.out.printf("A diferença entre %d x %d - %d x %d é = %d \n", a, b, c, d, Diferenca);
    sc.close();
    }

}