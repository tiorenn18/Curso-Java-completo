package Curso_java_seçao_arquivos.Exercicio_Fixaçao.classes;

public class Product {
    private String name;
    private double price;
    private Integer quantity;
    
    public Product() {
    }

    public Product(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double totalValue(){
        return quantity * price;
    }

    public String toString(){
        return name + ", " + price + ", " + quantity; 
    }
    
}
