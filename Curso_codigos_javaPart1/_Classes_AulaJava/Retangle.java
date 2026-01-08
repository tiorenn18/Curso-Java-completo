package Curso_codigos_javaPart1._Classes_AulaJava;

public class Retangle {
    
    public double lados; 
    public double bases;  

    public Double area(){
        return bases * lados;
    }

    public Double perimetro(){
        return 2 * (bases + lados);
    }
    
    public Double diagonal(){
        return Math.sqrt(Math.pow(lados, 2) + Math.pow(bases, 2));
    }
}   
