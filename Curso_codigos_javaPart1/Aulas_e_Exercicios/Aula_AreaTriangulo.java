package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Locale;
import java.util.Scanner;
import Curso_codigos_javaPart1._Classes_AulaJava.Triangle;

public class Aula_AreaTriangulo {  /*Utilizei um progama anterior e apliquei as devidas atualizaçoes. */
    public static void main(String[] args) {
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f \n",areaX);
        System.out.printf("Triangle Y area: %.4f \n",areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }

        else{
            System.out.println("Larger area: Y");
        }
        
        sc.close();

    }
}
