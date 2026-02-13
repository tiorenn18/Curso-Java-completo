package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Consumer.V3_Reference_Method_NonStatic.Entities;

public class Product {
    private String name;
    private Double price;
    
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public  void nonstaticPriceUpdated(){
        setPrice(getPrice() * 1.1);
        // Or: Price = Price * 1.1
    }

    public String toString(){
        return "Name: " + name + " Price $" + String.format("%.2f", price);
    }
}
