package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;
import aulas__java_meio._Classes_AulaJava.CalculatorStatic;

public class Aula_MembrosEstaticosV3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius: "); double radius = sc.nextDouble();

        double c = CalculatorStatic.circumference(radius); 
        double v = CalculatorStatic.volume(radius); 
        
        System.out.printf("Circumference: %.2f \n", c);
        System.out.printf("Volume: %.2f \n", v);
        System.out.printf("PI value: %.2f \n", CalculatorStatic.PI);
        sc.close();
    }
}