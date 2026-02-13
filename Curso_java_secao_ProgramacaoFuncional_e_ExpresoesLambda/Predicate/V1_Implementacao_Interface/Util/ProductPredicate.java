package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V1_Implementacao_Interface.Util;

import java.util.function.Predicate;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Predicate.V1_Implementacao_Interface.Entities.Product;

public class ProductPredicate implements Predicate<Product>  {

    @Override
    public boolean test(Product p)   {
        return p.getPrice() >= 100.0;
    }
    
}
