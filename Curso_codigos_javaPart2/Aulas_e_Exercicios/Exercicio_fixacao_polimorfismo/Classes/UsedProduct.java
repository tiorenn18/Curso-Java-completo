package Aulas_e_Exercicios.Exercicio_fixacao_polimorfismo.Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufacturagedate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, double price, Date manufaturagedate) {
        super(name, price);
        this.manufacturagedate = manufaturagedate;
    }
    
    @Override
    public String priceTag() {
        return super.getName() + "(Used)" + " $ "+ String.format("%.2f", super.getPrice()) + " (Manufacture date: " + f1.format(manufacturagedate) + ")" ;
    }
}
