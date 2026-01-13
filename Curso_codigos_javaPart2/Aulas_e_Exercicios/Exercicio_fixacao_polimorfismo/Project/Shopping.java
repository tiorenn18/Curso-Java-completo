package Aulas_e_Exercicios.Exercicio_fixacao_polimorfismo.Project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Aulas_e_Exercicios.Exercicio_fixacao_polimorfismo.Classes.ImportedProduct;
import Aulas_e_Exercicios.Exercicio_fixacao_polimorfismo.Classes.Product;
import Aulas_e_Exercicios.Exercicio_fixacao_polimorfismo.Classes.UsedProduct;

public class Shopping {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Product #" + (i+1) + "Data: ");
            System.out.print("Common, used, or Imported (c/u/i)? ");
            char r = sc.next().charAt(0);
            if (r == 'i' || r == 'I') {
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsfee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsfee));
            }

            else if (r == 'u' || r == 'U') {
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacturedate (DD/MM/YYYY): " );
                Date date = f1.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            }
            else{

                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(name, price));
            }
            System.out.println();
        }
    
        System.out.println("PRICES TAGS: ");
        for(Product p : list){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
