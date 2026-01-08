package Curso_codigos_javaPart1._Classes_AulaJava;

public class Calculator {
    // Clase utilizada no codigo Aula_MembrosEstaticosV2 
    
    public final double PI = 3.14159;

    public double circumference(double radius){
        return 2.0 * PI * radius;
    }
     public double volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
