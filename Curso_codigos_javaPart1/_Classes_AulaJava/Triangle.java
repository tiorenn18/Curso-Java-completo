package Curso_codigos_javaPart1._Classes_AulaJava;

public class Triangle{ /*criando uma classe para ser usada posteriormente e optimizar o exercicio da area do triangul. */

    public double a;
    public double b;
    public double c;

    public double area(){
        Double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c) );

    }

}