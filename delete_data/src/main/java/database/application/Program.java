package database.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.classes.ConnectionFactory;
import database.classes.IntegrityException;

public class Program {
    public static void main(String[] args) {

        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement st = conn.prepareStatement(
                "DELETE FROM department "
                + "WHERE "
                + "Id = ? "
            );
        ){
            st.setInt(1, 5);
            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected:" + rowsAffected);
        } catch(SQLException e){
            throw new IntegrityException (e.getMessage());
        }
    }
}