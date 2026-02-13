package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Consumer.V1_Consumer_Interface.Util;

import java.util.function.Consumer;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Consumer.V1_Consumer_Interface.Entities.Product;

public class PriceUpdated implements Consumer <Product> {

    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
    
}
