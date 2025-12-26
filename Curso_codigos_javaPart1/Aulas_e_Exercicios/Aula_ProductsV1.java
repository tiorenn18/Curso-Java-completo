package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;
import aulas__java_meio._Classes_AulaJava.ProductsV1;

public class Aula_ProductsV1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ProductsV1 products = new ProductsV1();

        System.out.println("Enter Product data: ");
        System.out.print("Name: "); products.name = sc.nextLine();
        System.out.print("Price: "); products.price = sc.nextDouble();
        System.out.print("Quantity: "); products.quantity = sc.nextInt();
        System.out.println();

        System.out.println("Products Data: " + products);
        System.out.println();
        System.out.printf("Enter the number of products to be in stock: "); int quantity = sc.nextInt(); 
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