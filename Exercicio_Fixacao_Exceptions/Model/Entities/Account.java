package Exercicio_Fixacao_Exceptions.Model.Entities;

import Exercicio_Fixacao_Exceptions.Model.Exceptions.AccountError;

public class Account {
    private Integer number;
    private String holder;
    private double balance;
    private double withDrawLimit;

    public Account(){
        
    }

    public Account(Integer number, String holder, double balance, double withDrawLimit) {
        if ( withDrawLimit < 50) {
            throw new AccountError("Error - limite de saque abaixo de R$  50.");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void deposit(double amount){
        if (amount < 0.01) {
            throw new AccountError("Quantia invalida para deposito");
        }
        this.balance += amount;
    }

    public void withDrawn(double amount){
        if (this.balance < amount) {
            throw new AccountError("Saldo indisponivel para saque. ");
        }
        if (withDrawLimit < amount) {
            throw new AccountError("A quantia excede o seu limite de saque. ");
        }
        this.balance -= amount;
    }


    
}
