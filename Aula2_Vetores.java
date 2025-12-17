package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;
import aulas__java_meio._Classes_AulaJava.ProductVetor;

public class Aula2_Vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductVetor[] vect = new ProductVetor[n];
        
        for (int i = 0; i < vect.length; i++){
            sc.nextLine();

            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductVetor(name,price);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double media = sum / vect.length;

        System.out.printf("O preço médio é de:  %.2f \n", media);
        sc.close();
    }
}
