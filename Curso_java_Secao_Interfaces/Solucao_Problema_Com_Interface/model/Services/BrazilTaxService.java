package Curso_java_Secao_Interfaces.Solucao_Problema_Com_Interface.model.Services;

public class BrazilTaxService implements TaxService {
    
    public double tax(double amount){
        if (amount <= 100.0){
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }
    }
}
