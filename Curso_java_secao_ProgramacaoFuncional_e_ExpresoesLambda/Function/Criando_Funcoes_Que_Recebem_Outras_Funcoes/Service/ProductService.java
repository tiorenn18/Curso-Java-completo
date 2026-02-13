package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.Criando_Funcoes_Que_Recebem_Outras_Funcoes.Service;

import java.util.List;
import java.util.function.Predicate;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Function.Criando_Funcoes_Que_Recebem_Outras_Funcoes.entities.Product;

public class ProductService {
    public Double filteredSum(List <Product> list, Predicate <Product> criteria){
        Double sum = 0.0;
        for(Product p : list){
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
