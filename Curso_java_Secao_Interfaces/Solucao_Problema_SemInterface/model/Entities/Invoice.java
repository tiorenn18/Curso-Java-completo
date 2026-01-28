package Curso_java_Secao_Interfaces.Solucao_Problema_SemInterface.model.Entities;

public class Invoice {
    private double basicPayment;
    private double tax;
    
    public Invoice() {
    }

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPayment(){
        return getBasicPayment() + getTax();
    }
    
}
