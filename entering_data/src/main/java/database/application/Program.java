package database.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import database.classes.ConnectionFactory;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement st = conn.prepareStatement(
                "INSERT INTO seller"
                +"(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                +"VALUES "
                +"(?, ?, ?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS);

            ) {
                st.setString(1, "joão freitas");
                st.setString(2, "jaofr@gmai.com");
                st.setDate(3, new java.sql.Date(sdf.parse("10/05/2005").getTime()));
                st.setDouble(4, 4500.0);
                st.setInt(5, 3);

                int rowsAffected = st.executeUpdate();

                if (rowsAffected > 0) {
                    try(ResultSet rs = st.getGeneratedKeys()){
                        while (rs.next()) {
                            int id = rs.getInt(1);
                            System.out.println("Done! ID = " + id);
                        }
                    }
                } else{
                    System.out.println("no row affected");
                }
                
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ParseException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
