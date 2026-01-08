package clases_aulas_java;

public class SavingAcountplus extends SavingAcount_AulaCasting {
    @Override
    public void withDraw(double amount){
        balance -= amount + 2.0;

    }
}
