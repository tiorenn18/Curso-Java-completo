package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_Estrutura_For_7 {
    public static void main(String[] args) {

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo. */

        Scanner sc = new Scanner(System.in);
        int n; System.out.print("Numero de linhas; "); n = sc.nextInt();

        for (int i = 1; i <= n; i += 1){
            double quadrado = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);

            System.out.printf("%d %.0f %.0f \n", i, quadrado, cubo);
        }

        sc.close();
    }
}
