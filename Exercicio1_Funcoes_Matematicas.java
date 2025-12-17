package aulas_java_Iniciando;
 
import java.util.Scanner;

public class Exercicio1_Funcoes_Matematicas {
    public static void main(String[] args) {
/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */
/* Entrada: 10 e 30 Saida: "soma = 40"*/

        Scanner sc = new Scanner(System.in);
        double val1, val2, soma;

        System.out.print("Escreva um valor: "); val1 = sc.nextDouble(); 
        System.out.print("Escreva um outro valor: "); val2 = sc.nextDouble(); 
        soma = val1 + val2;

        System.out.printf("A soma entre %.0f e %.0f é igual a: %.0f \n", val1, val2, soma);
        
        sc.close();
    }
}
