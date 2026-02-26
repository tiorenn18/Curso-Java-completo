package database.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.classes.connectionFactory;

public class Program {
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            conn = connectionFactory.connectDatabase();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");

            while (rs.next()) {
                System.out.printf(("Id: %d, Name: %s \n"), rs.getInt("Id"), rs.getString("Name"));
            }
        }  catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally{
            connectionFactory.closeResultSet(rs);
            connectionFactory.closeStatement(st);
            connectionFactory.closeConnection(conn);
            
        }
    }
}
