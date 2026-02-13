package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.Entities.Product;

public class ComparatorV2 {
    public static void main(String[] args) { //Forma 2, O método de comparaçao fica em conjunto com o programa principal e Objeto de classe anonima,

        List <Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
    
        Comparator<Product> comp = new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        list.sort(comp);

        for(Product p : list){

            System.out.println(p);
            System.out.println();
        }
    }
}
