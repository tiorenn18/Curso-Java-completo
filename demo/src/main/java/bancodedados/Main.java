package bancodedados;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        
        try(Connection conn = ConnectionFactory.connectDataBase() ){
            System.out.println("Connectado ao banco de dados!");

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        try (Connection conn = ConnectionFactory.connectDataBase()){
            conn.close();
            System.out.println("Banco de Dados desconectado!");
            
        } catch ( SQLException e){
            System.out.println(e.getMessage());
        }
    }
}