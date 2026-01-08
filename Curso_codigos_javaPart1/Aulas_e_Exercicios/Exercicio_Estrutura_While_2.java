package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_Estrutura_While_2 {
    public static void main(String[] args) { 

/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

        Scanner sc = new Scanner(System.in);
        int senha;
        System.out.print("Escreva sua senha: "); senha = sc.nextInt();

        while ( senha != 2002 ) {
            System.out.println("senha invalida.");
            System.out.print("Escreva sua senha novamente: "); senha = sc.nextInt();  
        }
        System.out.println("acesso permitido.");

        sc.close();
    }
}
