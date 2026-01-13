package Aulas_e_Exercicios.Exercicio_fixacao_classes_abstratas.Classes;

public class Individual extends Taxplayer {
    private double healthExpenditures;

    public Individual(){
        super();
    }
    
    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double Impost() {
        if (super.getAnualIncome() < 20000.00) {
            return (super.getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
        }

        else{
            return (super.getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
        }
    }
}
