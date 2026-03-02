package database.classes;

public class IntegrityException extends RuntimeException{
    
    public IntegrityException(String msg){
        super(msg);
    }
}
