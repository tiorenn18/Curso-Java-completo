package Curso_codigos_javaPart1.Aulas_e_Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_Condicionais6 {
    public static void main(String[] args) {
        /*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.print("Digite um valor: "); valor = sc.nextDouble();
        System.out.println();
        if (valor < 0.0 || valor > 100.0){
            System.out.println("valor fora de intervalo. ");
        }
        else if (valor >= 0.25 & valor < 25.50){
            System.out.println("esse valor se encontra no intervalo {0.25}");
        }
        else if (valor >= 25.50 & valor < 50.75){
            System.out.println("esse valor se encontra no intervalo {25.50}");
        }
        else if (valor >= 50.75 & valor < 75.100){
            System.out.println("esse valor se encontra no intervalo {50.75}");
        }
        else {
            System.out.println("esse valor se encontra no intervalo {75.100.");
        }
        sc.close();
    }
}
