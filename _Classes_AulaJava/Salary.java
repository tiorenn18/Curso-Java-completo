package aulas__java_meio._Classes_AulaJava;

public class Salary {

    public String Name;
    public Double GrossSalary;
    public Double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }
    public void increaseSalary(Double porcentage){
        GrossSalary += GrossSalary * porcentage / 100.0;
    }
    public String toString() {
        return Name + ", $ " + String.format("%.2f", NetSalary());
    }
}
