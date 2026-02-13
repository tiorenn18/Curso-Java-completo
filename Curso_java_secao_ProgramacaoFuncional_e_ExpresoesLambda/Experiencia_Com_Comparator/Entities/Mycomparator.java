package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Experiencia_Com_Comparator.Entities;

import java.util.Comparator;

public class Mycomparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    
}
