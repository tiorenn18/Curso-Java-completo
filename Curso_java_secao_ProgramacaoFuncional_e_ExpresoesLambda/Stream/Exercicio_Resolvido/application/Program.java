package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Stream.Exercicio_Resolvido.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Stream.Exercicio_Resolvido.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full path file: ");
        String path = sc.next();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            List<Product> list = new ArrayList<>();

            String line = bf.readLine();
            while (line != null) {
                String [] field = line.split(",");
                list.add(new Product(field[0], Double.parseDouble(field[1])));
                line = bf.readLine(); 
            }

            Double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y / list.size());
            
            System.out.println("Average  Price: " + String.format("%.2f", avg));

            Comparator <String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
