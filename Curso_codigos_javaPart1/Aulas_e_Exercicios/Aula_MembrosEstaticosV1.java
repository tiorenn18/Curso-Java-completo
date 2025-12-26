package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;

public class Aula_MembrosEstaticosV1{
    
    public static final Double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius: "); Double radius = sc.nextDouble();
        
        Double c = circumference(radius);
        Double v = volume(radius);

        System.out.printf("Circumference: %.2f \n", c);
        System.out.printf("Volume: %.2f \n", v);
        System.out.printf("PI value: %.2f \n", PI);
        sc.close();
    }
    public static Double circumference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}