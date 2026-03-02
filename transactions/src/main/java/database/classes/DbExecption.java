package database.classes;

public class DbExecption extends RuntimeException {
    
    public DbExecption (String msg){
        super(msg);
    }    
}
