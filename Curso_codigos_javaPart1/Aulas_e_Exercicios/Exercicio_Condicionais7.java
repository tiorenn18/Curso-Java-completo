package Curso_codigos_javaPart1.Aulas_e_Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Condicionais7 {
    public static void main(String[] args) {
        /* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        situação. */

        double X,Y;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva onde X está localizado: "); X = sc.nextDouble();
        System.out.print("Escreva onde Y está localizado: "); Y = sc.nextDouble();

        if (X == 0 & Y == 0){
            System.out.println("Pertence a Origem");
        }
        else if (X == 0 & Y >= 1){
            System.out.printf("Sobre o eixo X e Y = %.1f \n",Y);
        }
        else if (Y == 0 & X >= 1){
            System.out.printf("Sobre o eixo Y e X = %.1f \n",Y);
        }
        else if (X < 0 & Y < 0){
            System.out.println("Pertence ao quadrante [Q3]");
        }
        else if (X < 0 & Y > 0){
            System.out.println("Pertence ao quadrante [Q2]");
        }
        else if (X > 0 & Y > 0){
            System.out.println("Pertence ao quadrante [Q1]");
        }
        else {
            System.out.println("Pertence ao quadrante [Q4]");
        }
        sc.close();
    }
}
