package Curso_codigos_javaPart1._Classes_AulaJava;

public class ProductsV4 {

    private String name;
    private Double price;
    private int quantity;

    public ProductsV4(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
     public ProductsV4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice (Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public Double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units,  Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
