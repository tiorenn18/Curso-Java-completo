package Aulas_e_Exercicios.Exercicio_fixacao_classes_abstratas.Classes;

public abstract class Taxplayer {
    private String name;
    private double anualIncome;
    
    public Taxplayer() {
    }

    public Taxplayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double Impost();

}
