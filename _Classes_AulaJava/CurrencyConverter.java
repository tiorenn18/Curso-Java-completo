package aulas__java_meio._Classes_AulaJava;

public class CurrencyConverter {

    public static final Double IOF = 0.06;


    public static Double converter(double amount,Double Dollarprice){
        return amount * Dollarprice * (1.0 + IOF);
    }
}