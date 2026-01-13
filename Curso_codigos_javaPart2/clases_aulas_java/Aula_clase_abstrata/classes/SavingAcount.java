package classes;

public  class SavingAcount extends Acount {
    private double interestRate;

    public SavingAcount(){
        super();
    }

    public SavingAcount(Integer number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate ;
    }

    //aula de sobreposiçao
    @Override
    public void withDraw(double amount){
        balance -= amount;
    }
}
