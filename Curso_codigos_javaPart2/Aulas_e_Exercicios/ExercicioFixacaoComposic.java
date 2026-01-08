package Aulas_e_Exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import clases_aulas_java.ClientProduct;
import clases_aulas_java.OrderProduct;
import clases_aulas_java.OrderStatusProducts;
import clases_aulas_java.Orderitem;
import clases_aulas_java.Product;

public class ExercicioFixacaoComposic {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY) ");
        Date birthdate = sdf.parse(sc.next());

        ClientProduct client = new ClientProduct(name, email, birthdate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatusProducts status = OrderStatusProducts.valueOf(sc.next());

        OrderProduct order = new OrderProduct(new Date(), status, client);

        System.out.print("How many many items to this order? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product Name: ");
            String prodctName = sc.nextLine();

            System.out.print("Product Price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(prodctName, productPrice);
            Orderitem orderItem = new Orderitem(productQuantity, productPrice, product);
            order.addItems(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
        sc.close();
    }
}
