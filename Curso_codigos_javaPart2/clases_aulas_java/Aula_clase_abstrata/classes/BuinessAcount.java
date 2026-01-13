package classes;

public class BuinessAcount extends Acount {
    
    private double loanLimit;

    public BuinessAcount(){

    }

    public BuinessAcount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    // aula de sobreposiçao e entendendo o uso do [super]
    @Override
    public void withDraw(double amount) {
        super.withDraw(amount);
        balance -= 2.0;
    }
    
}
