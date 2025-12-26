package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;
import aulas__java_meio._Classes_AulaJava.ProductsV4;

// utilizando Product V4
public class Aula_Encapsulamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product data: ");
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Price: "); Double price = sc.nextDouble();
        System.out.println();

        ProductsV4 products = new ProductsV4(name, price);

        products.setName("Computer");
        System.out.println("Updated Name: "+ products.getName());
        products.setPrice(1200.00);
        System.out.printf("Updated Price: %.2f \n",products.getPrice());
        


        System.out.println();

        System.out.println("Products Data: " + products);
        System.out.println();
        System.out.print("Enter the number of products to be in stock: "); 
        
        int quantity = sc.nextInt();
        products.addProducts(quantity);

        System.out.println();
        System.out.println("Updated Data: " + products);
        System.out.println();

        System.out.printf("Enter the number of products to be removed from stock: "); quantity = sc.nextInt();
        products.removeProducts(quantity); 
        System.out.println();
        
        System.out.println("Updated Data: " + products);

        sc.close();
    }
}
