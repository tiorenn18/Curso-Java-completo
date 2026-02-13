package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V5_ExpresaoLambda_In_Line.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V4_ExpresaoLambda_Declarada.Entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Caso queira podemos até mesmo adicionar uma variavel para o nosso numero minimo ex: 100;

        //Double min = 100; 
        
        list.removeIf(p-> p.getPrice() >= 100); // >= min

        for (Product p : list){
            System.out.println(p);
        }
    }
}
