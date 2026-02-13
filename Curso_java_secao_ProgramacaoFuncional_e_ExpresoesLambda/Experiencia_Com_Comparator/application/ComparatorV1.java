package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.application;

import java.util.ArrayList;
import java.util.List;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.Entities.Mycomparator;
import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.Entities.Product;

public class ComparatorV1 {
    public static void main(String[] args) { //Forma 1, Utilizando uma clase para o comparator, fica à parte do Programa principal 

        List <Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        list.sort(new Mycomparator());

        for(Product p : list){

            System.out.println(p);
            System.out.println();
        }
    }
}
