package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;

import aulas__java_meio._Classes_AulaJava.ProductsV2;
// Product V2
public class Aula_Contrutores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product data: ");
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Price: "); Double price = sc.nextDouble();
        System.out.print("Quantity: "); int quantity = sc.nextInt();
        System.out.println();

        ProductsV2 products = new ProductsV2(name, price, quantity);

        System.out.println("Products Data: " + products);
        System.out.println();
        System.out.print("Enter the number of products to be in stock: "); quantity = sc.nextInt();

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
