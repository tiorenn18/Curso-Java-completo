package Curso_codigos_javaPart1._Classes_AulaJava;

public class ProductVetor {
    private String name;
    private Double price;

    public ProductVetor(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}