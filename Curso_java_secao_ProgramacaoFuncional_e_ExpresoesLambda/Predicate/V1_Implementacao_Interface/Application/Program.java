package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V1_Implementacao_Interface.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V1_Implementacao_Interface.Entities.Product;
import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V1_Implementacao_Interface.Util.ProductPredicate;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate());

        for (Product p : list){
            System.out.println( p);
        }
    }
}
