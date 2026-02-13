package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.V1_Implementando_Interface.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.V1_Implementando_Interface.Entities.Product;
import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.V1_Implementando_Interface.util.UpercaseName;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List <String> names = list.stream().map(new UpercaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}