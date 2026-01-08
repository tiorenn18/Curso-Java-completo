package clases_aulas_java;

public class Orderitem {
    private Integer quantity;
    private Double price;

    private Product product;

    public Orderitem(){

    }
    public Orderitem(Integer quantity, Double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public void setQuanity(Integer quantity){
        this.quantity = quantity;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public Double getPrice(){
        return price;
    }

    public Double subTotal(){
        return quantity * price;
    }
    public String toString(){
        return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal : $" + String.format("%.2f", subTotal());

    }
}