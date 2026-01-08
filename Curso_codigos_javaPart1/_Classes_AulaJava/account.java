package Curso_codigos_javaPart1._Classes_AulaJava;

public class account{
    private int Number;
    private String Hold;
    private double balance;

    public account (int Number, String Hold) {
        this.Number = Number;
        this.Hold = Hold;
    } 

    public account (int Number, String Hold, double initialdeposity) {
        this.Number = Number;
        this.Hold = Hold;
        Deposity(initialdeposity);
    }

    public int getacountNumber() {
        return Number;
    }

    public String getAcounthold() {
        return Hold;
    }
    public void setAcounthold(String Acounthold) {
        this.Hold = Acounthold;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposity(double deposity) {
        this.balance += deposity;
    }
    public void saque(double saque) {
        this.balance -= saque + 5.0 ;
    }

    public String toString() {
        return "Number:" + getacountNumber() + ", Holder: " + getAcounthold() +", Balance: " + String.format("%.2f", getBalance());
    }
}