package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio6_Funcoes_Matematicas {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double  A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, altura; 

    altura = 2.0;

    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();
    

    triangulo = (A * C) / altura;
    circulo = 3.14159 * C * C;
    trapezio = (A + B) / altura * C;
    quadrado = B * B;
    retangulo = A * B;

    System.out.println();
    System.out.printf("Triangulo: %.3f \n", triangulo);
    System.out.printf("Circulo: %.3f \n", circulo);
    System.out.printf("Trapezio: %.3f \n", trapezio);
    System.out.printf("Quadrado: %.3f \n", quadrado);
    System.out.printf("Retangulo: %.3f \n", retangulo);

    sc.close();
    }
}
