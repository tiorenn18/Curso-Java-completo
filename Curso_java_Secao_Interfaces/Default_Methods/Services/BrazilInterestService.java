package Curso_java_Secao_Interfaces.Default_Methods.Services;

public class BrazilInterestService implements InterestService {
    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override   
    public double getInterestRate() {
        return interestRate;
    }
}


