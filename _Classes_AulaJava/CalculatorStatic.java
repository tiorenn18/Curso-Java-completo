package aulas__java_meio._Classes_AulaJava;

public class CalculatorStatic {
    // Clase utilizada no codigo Aula_MembrosEstaticosV3 
    
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }
     public static double volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}