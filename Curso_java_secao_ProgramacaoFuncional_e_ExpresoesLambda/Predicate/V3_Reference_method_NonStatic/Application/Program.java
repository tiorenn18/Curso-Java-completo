package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V3_Reference_method_NonStatic.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V3_Reference_method_NonStatic.Entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(Product::nonstaticProductPredicate);

        for (Product p : list){
            System.out.println( p);
        }
    }
}
