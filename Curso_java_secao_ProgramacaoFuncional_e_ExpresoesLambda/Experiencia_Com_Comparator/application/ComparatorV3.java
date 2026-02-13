package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.Entities.Product;

public class ComparatorV3 {
    public static void main(String[] args) { //Forma 3, Utilizando o padrao da forma 2, mas utilizando a funçao lambda (Funçao anonima/Arow )

        List <Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
    
        Comparator<Product> comp = (p1, p2) -> { // Funçao Lambda com chaves;
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
    

        list.sort(comp);

        for(Product p : list){

            System.out.println(p);
            System.out.println();
        }
    }
}
