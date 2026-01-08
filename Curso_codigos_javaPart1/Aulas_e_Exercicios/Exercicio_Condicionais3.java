package Curso_codigos_javaPart1.Aulas_e_Exercicios;
import java.util.Scanner;

public class Exercicio_Condicionais3 {
    public static void main(String[] args) {
        /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente.*/

        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("digite um número: "); num1 = sc.nextInt();
        System.out.print("digite outro número: "); num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("são multiplos.");
        }
        else{
            System.out.println("não são multiplos.");
        }
        
        sc.close();
    }
}
