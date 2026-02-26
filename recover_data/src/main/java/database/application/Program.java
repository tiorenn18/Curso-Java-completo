package database.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.classes.ConnectionFactory;

public class Program {
    public static void main(String[] args) {
        
        try (Connection conn = ConnectionFactory.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from department");
        ) {

            while (rs.next()) {
                System.out.printf("Id: %d, Name: %s \n",
                        rs.getInt("Id"), 
                        rs.getString("Name"));
            }
        }  catch (SQLException e){
            System.out.println(e.getMessage());
       
        }
    }
}
