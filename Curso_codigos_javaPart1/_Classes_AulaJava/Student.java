package Curso_codigos_javaPart1._Classes_AulaJava;

public class Student{
    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public Double media(){
        return nota1 + nota2 + nota3 ;
    }
    public double points(){
        if (media() < 60.0) {
            return 60.0 - media();
        }
        else{
            return 0.0;
        }
    }
}