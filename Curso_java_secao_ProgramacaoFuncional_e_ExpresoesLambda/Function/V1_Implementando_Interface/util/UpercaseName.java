package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.V1_Implementando_Interface.util;

import java.util.function.Function;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.V1_Implementando_Interface.Entities.Product;

public class UpercaseName implements Function< Product,String > {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}
