package classes;

public abstract class Acount {
    private Integer number;
    private String holder;
    protected double balance;
    
    public Acount() {
    }

    public Acount(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void withDraw(double amount){
        balance -= amount + 5.0;
    }

    public void deposit(double amount){
        balance += amount;
    }
}

