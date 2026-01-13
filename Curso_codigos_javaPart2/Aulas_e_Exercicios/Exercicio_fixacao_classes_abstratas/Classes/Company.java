package Aulas_e_Exercicios.Exercicio_fixacao_classes_abstratas.Classes;

public class Company extends Taxplayer{
    private Integer numberEmployees;

    public Company(){
        super();
    }
    
    public Company(String name, double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double Impost() {
        if (numberEmployees > 10) {
            return super.getAnualIncome() * 0.14;
        }
        else{
            return super.getAnualIncome() * 0.16;
        }
    }
}
