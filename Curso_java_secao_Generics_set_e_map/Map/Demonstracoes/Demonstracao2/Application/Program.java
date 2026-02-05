package Curso_java_secao_Generics_set_e_map.Map.Demonstracoes.Demonstracao2.Application;

import java.util.HashMap;
import java.util.Map;

import Curso_java_secao_Generics_set_e_map.Map.Demonstracoes.Demonstracao2.Entities.Product;

public class Program {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contais 'ps' key: " + stock.containsKey(ps));

    }
}
