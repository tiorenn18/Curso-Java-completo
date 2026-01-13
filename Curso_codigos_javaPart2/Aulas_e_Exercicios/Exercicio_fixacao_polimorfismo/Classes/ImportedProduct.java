package Aulas_e_Exercicios.Exercicio_fixacao_polimorfismo.Classes;

public class ImportedProduct extends Product {
    private double customsFee;


    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, double price, double customsfee) {
        super(name, price);
        this.customsFee = customsfee;
    }

    public double totalPrice(){
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return super.getName() + "$ " + String.format("%.2f", totalPrice()) + "(Customs fee: $ " + customsFee + ")";
    }
}
