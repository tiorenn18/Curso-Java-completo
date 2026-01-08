package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Estrutura_DoWhile_ {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double C;
        char resposta;

        do {
            System.out.print("Qual a temperatura em celsius? "); C = sc.nextDouble();
            Double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Temperatura em Fahrenheit: %.1f \n",F);
            System.out.println();
            System.out.print("Quer continuar? [sim/nao]: ");  resposta = sc.next().charAt(0);}

            while(resposta == 's');

        sc.close();
    }
}
