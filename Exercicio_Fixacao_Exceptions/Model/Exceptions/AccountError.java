package Exercicio_Fixacao_Exceptions.Model.Exceptions;

public class AccountError extends RuntimeException {
    
    public AccountError(String msg){
        super(msg);
    }
}
