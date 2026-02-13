package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.application;

import java.util.ArrayList;
import java.util.List;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.Entities.Product;

public class ComparatorV5 {
    public static void main(String[] args) { //Forma 5 - Expresao Lambda Direto no Argumento

        List <Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
    
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); 
        for(Product p : list){

            System.out.println(p);
            System.out.println();
        }
    }
}