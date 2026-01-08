package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Locale;
import java.util.Scanner;
import Curso_codigos_javaPart1._Classes_AulaJava.Retangle;

public class Exercicio1_Retangle {
    public static void main(String[] args) {
        Retangle retangulo;
        retangulo = new Retangle();
        

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a largura do retangulo: "); retangulo.bases = sc.nextDouble();
        System.out.print("enter a altura do retangulo: "); retangulo.lados = sc.nextDouble();
        System.out.println();

        System.out.println("Area = "+ String.format("%.2f", retangulo.area()));
        System.out.println("Perimetro = " + String.format("%.2f", retangulo.perimetro()));
        System.out.println("Diagonal = " + String.format("%.2f", retangulo.diagonal()));


        sc.close();
    }
}
