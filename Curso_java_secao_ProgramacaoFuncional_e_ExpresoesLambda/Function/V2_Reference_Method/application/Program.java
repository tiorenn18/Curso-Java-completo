package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.V2_Reference_Method.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.V2_Reference_Method.Entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}