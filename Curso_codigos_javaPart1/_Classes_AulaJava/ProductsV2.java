package Curso_codigos_javaPart1._Classes_AulaJava;

public class ProductsV2 {

    public String name;
    public Double price;
    public int quantity;

    public ProductsV2(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
    return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units,  Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
