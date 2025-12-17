package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;

import aulas__java_meio._Classes_AulaJava.ProductsV3;
// Product V2
public class Aula_Contrutores2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product data: ");
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Price: "); Double price = sc.nextDouble();
        System.out.println();

        ProductsV3 products = new ProductsV3(name, price);

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
