package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.Criando_Funcoes_Que_Recebem_Outras_Funcoes.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
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
    
    public String toString(){
        return "Name: "+ name + "Price: $" + String.format("%.2f", price);
    }
}
