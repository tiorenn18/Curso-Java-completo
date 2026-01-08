package Curso_codigos_javaPart1._Classes_AulaJava;

public class Alturas_vect {
    private String name;
    private int idade;
    private double altura;

    public Alturas_vect(String name, int idade, double altura){
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public void setName (String name){
        this.name = name;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public void setAltura (Double altura){
        this.altura = altura;
    }
    public String getName(){
        return name;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }
}
