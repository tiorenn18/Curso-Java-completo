package database.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.classes.ConnectionFactory;

public class Program {
    public static void main(String[] args) {
        
        try (Connection conn = ConnectionFactory.getConnection();
        PreparedStatement st = conn.prepareStatement(
            "UPDATE seller "
            + "SET BaseSalary = BaseSalary + ? "
            + "WHERE "
            + "(DepartmentId = ?)");
    ) {
            st.setDouble(1, 200.0);
            st.setInt(2, 2);

            int rowsAffectd = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffectd );

        } catch (SQLException e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
