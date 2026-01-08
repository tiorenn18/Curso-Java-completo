package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_Estrutura_For_6 {
    public static void main(String[] args) {

        /*Ler um número inteiro N e calcular todos os seus divisores.*/
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i += 1 ){
            if (x % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
