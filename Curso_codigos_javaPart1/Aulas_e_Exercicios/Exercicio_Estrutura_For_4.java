package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Estrutura_For_4 {
    public static void main(String[] args) {

/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */    
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Digite quantas vezes repetir o loop: "); x = sc.nextInt();

        for (int i = 1; i <= x; i+= 1) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num2 == 0){
                System.out.println("Divisão imposivel: ");
            }
            else {
                double divisao = (double) num1 / num2;
                System.out.println("A divisão é: "+ divisao);
            }
        }
        sc.close();
    }
}
